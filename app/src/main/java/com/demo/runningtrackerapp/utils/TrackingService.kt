package com.demo.runningtrackerapp.utils

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.NotificationManager.IMPORTANCE_LOW
import android.app.PendingIntent
import android.app.PendingIntent.FLAG_UPDATE_CURRENT
import android.app.PendingIntent.readPendingIntentOrNullFromParcel
import android.content.Context
import android.content.Intent
import android.graphics.Insets.add
import android.location.Location
import android.location.LocationRequest
import android.os.Build
import android.os.Looper
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.lifecycle.LifecycleService
import androidx.lifecycle.MutableLiveData
import com.demo.runningtrackerapp.MainActivity
import com.demo.runningtrackerapp.R
import com.demo.runningtrackerapp.utils.Constants.ACTION_PAUSE_SERVICE
import com.demo.runningtrackerapp.utils.Constants.ACTION_SHOW_TRACKING_FRAGMENT
import com.demo.runningtrackerapp.utils.Constants.ACTION_START_OR_RESUME_SERVICE
import com.demo.runningtrackerapp.utils.Constants.ACTION_STOP_SERVICE
import com.demo.runningtrackerapp.utils.Constants.FASTEST_LOCATION_INTERVAL
import com.demo.runningtrackerapp.utils.Constants.LOCATION_UPDATE_INTERVAL
import com.demo.runningtrackerapp.utils.Constants.NOTIFICATION_CHANNEL_ID
import com.demo.runningtrackerapp.utils.Constants.NOTIFICATION_CHANNEL_NAME
import com.demo.runningtrackerapp.utils.Constants.NOTIFICATION_ID
import com.demo.runningtrackerapp.utils.Constants.NOTIFICATION_TITLE
import com.demo.runningtrackerapp.utils.Constants.TIMER_UPDATE_INTERVAL
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest.PRIORITY_HIGH_ACCURACY
import com.google.android.gms.location.LocationResult
import com.google.android.gms.maps.model.LatLng
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject


typealias  Polyline = MutableList<LatLng>
typealias  Polylines = MutableList<Polyline>

@AndroidEntryPoint
class TrackingService : LifecycleService() {

    var isFirstRun = true
    private var isTimerEnable = false
    private var lapTime = 0L
    private var totalTimeRun = 0L
    private var timeStarted = 0L
    private var lastSecondTimeStamp = 0L

    // for getting updated location
    @Inject
    lateinit var fusedLocationProviderClient: FusedLocationProviderClient

    @Inject
    lateinit var notificationBuilder: NotificationCompat.Builder

    private lateinit var currentNotification: NotificationCompat.Builder

    private var timeInSeconds = MutableLiveData<Long>()

    companion object {
        val timeInMillSeconds = MutableLiveData<Long>()
        val isTracking = MutableLiveData<Boolean>()
        val pathPoints = MutableLiveData<Polylines>()
    }

    override fun onCreate() {
        super.onCreate()
        currentNotification = notificationBuilder
        setInitialValues()
        fusedLocationProviderClient = FusedLocationProviderClient(this)

        isTracking.observe(this, {
            updatingTrackingLocation(it)
            updateNotificationTrackingService(it)
        })

    }

    private fun setInitialValues() {
        isTracking.postValue(false)
        pathPoints.postValue(mutableListOf())
        timeInSeconds.postValue(0L)
        timeInMillSeconds.postValue(0L)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        intent?.let {
            when (it.action) {
                ACTION_START_OR_RESUME_SERVICE -> {
                    if (isFirstRun) {
                        startForegroundService()
                        isFirstRun = false
                    } else {
                        Timber.d("Resume service...")
                        startTimer()

                    }
                }
                ACTION_PAUSE_SERVICE -> {
                    Timber.d("Pause service")
                    pauseService()
                }
                ACTION_STOP_SERVICE -> {
                    Timber.d("Stopped service")
                }
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }


    private fun startForegroundService() {
        startTimer()
        isTracking.postValue(true)
        val notificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            createNotificationChannel(notificationManager)
        }

        startForeground(NOTIFICATION_ID, notificationBuilder.build())

        timeInSeconds.observe(this, {
            val notification = currentNotification
                .setContentText(TrackingUtil.getFormattedStopWatchTime(it * 1000L))
            notificationManager.notify(NOTIFICATION_ID, notification.build())
        })
    }

    private fun startTimer() {
        addEmptyPolyline()
        isTracking.postValue(true)
        timeStarted = System.currentTimeMillis()
        isTimerEnable = true
        CoroutineScope(Dispatchers.Main).launch {
            while (isTracking.value!!) {
                // time difference between now and timeStarted
                lapTime = System.currentTimeMillis() - timeStarted
                // post the new lapTime
                timeInMillSeconds.postValue(totalTimeRun + lapTime)
                if (timeInMillSeconds.value!! >= lastSecondTimeStamp + 1000L) {
                    timeInSeconds.postValue(timeInSeconds.value!! + 1)
                    lastSecondTimeStamp += 1000L
                }
                delay(TIMER_UPDATE_INTERVAL)
            }
            totalTimeRun += lapTime
        }
    }

    private fun addEmptyPolyline() = pathPoints.value?.apply {
        add(mutableListOf())
        pathPoints.postValue(this)

    } ?: pathPoints.postValue(mutableListOf(mutableListOf()))

    private fun addPathPoint(location: Location?) {
        location?.let {
            val position = LatLng(location.latitude, location.longitude)
            pathPoints.value?.apply {
                last().add(position)
                pathPoints.postValue(this)
            }
        }
    }


    private fun updateNotificationTrackingService(isTracking: Boolean) {
        val notificationActionText = if (isTracking) "Pause" else "Resume"
        val pendingIntent = if (isTracking) {
            val pauseIntent = Intent(this, TrackingService::class.java).apply {
                action = ACTION_PAUSE_SERVICE
            }
            PendingIntent.getService(this, 1, pauseIntent, FLAG_UPDATE_CURRENT)
        } else {
            val resumeIntent = Intent(this, TrackingService::class.java).apply {
                action = ACTION_START_OR_RESUME_SERVICE
            }
            PendingIntent.getService(this, 2, resumeIntent, FLAG_UPDATE_CURRENT)
        }

        val notificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        // to track change every second
        currentNotification.javaClass.getDeclaredField("mActions").apply {
            isAccessible = true
            set(currentNotification, ArrayList<NotificationCompat.Action>())
        }
        currentNotification = notificationBuilder
            .addAction(R.drawable.ic_paus_black, notificationActionText, pendingIntent)

        notificationManager.notify(NOTIFICATION_ID, currentNotification.build())
    }

    private fun pauseService() {
        isTracking.postValue(false)
        isTimerEnable = false
    }


    @SuppressLint("MissingPermission")
    private fun updatingTrackingLocation(isTracking: Boolean) {
        if (isTracking) {
            if (TrackingUtil.hasLocationPermission(this)) {
                val request = com.google.android.gms.location.LocationRequest().apply {
                    interval = LOCATION_UPDATE_INTERVAL
                    fastestInterval = FASTEST_LOCATION_INTERVAL
                    priority = PRIORITY_HIGH_ACCURACY
                }
                fusedLocationProviderClient.requestLocationUpdates(
                    request,
                    locationCallback,
                    Looper.getMainLooper()
                )
            }
        } else {
            fusedLocationProviderClient.removeLocationUpdates(locationCallback)
        }
    }


    @RequiresApi(Build.VERSION_CODES.O)
    private fun createNotificationChannel(notificationManager: NotificationManager) {
        val channel = NotificationChannel(
            NOTIFICATION_CHANNEL_ID,
            NOTIFICATION_CHANNEL_NAME,
            IMPORTANCE_LOW,
        )
        notificationManager.createNotificationChannel(channel)
    }

    private val locationCallback = object : LocationCallback() {
        override fun onLocationResult(result: LocationResult?) {
            super.onLocationResult(result)
            if (isTracking.value!!) {
                result?.locations?.let { locations ->
                    for (location in locations) {
                        addPathPoint(location)
                    }
                }
            }
        }
    }
}