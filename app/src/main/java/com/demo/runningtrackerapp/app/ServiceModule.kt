package com.demo.runningtrackerapp.app

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import com.demo.runningtrackerapp.MainActivity
import com.demo.runningtrackerapp.R
import com.demo.runningtrackerapp.utils.Constants
import com.google.android.gms.location.FusedLocationProviderClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ServiceComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ServiceScoped

@Module
@InstallIn(ServiceComponent::class)
object ServiceModule {

    @ServiceScoped
    @Provides
    fun provideFusedLocationProvider(
        @ApplicationContext context: Context
    ) = FusedLocationProviderClient(context)

    @ServiceScoped
    @Provides
    fun providePendingIntent(@ApplicationContext context: Context) = PendingIntent.getActivity(
        context,
        0,
        Intent(context, MainActivity::class.java).also {
            it.action = Constants.ACTION_SHOW_TRACKING_FRAGMENT
        },
        PendingIntent.FLAG_UPDATE_CURRENT
    )

    @ServiceScoped
    @Provides
    fun provideNotificationBuilder(
        @ApplicationContext context: Context,
        pendingIntent: PendingIntent
    ) = NotificationCompat.Builder(
        context,
        Constants.NOTIFICATION_CHANNEL_ID
    )
        .setAutoCancel(false)
        .setOngoing(true)
        .setSmallIcon(R.drawable.ic_run_black)
        .setContentTitle(Constants.NOTIFICATION_TITLE)
        .setContentText("00:00:00")
        .setContentIntent(pendingIntent)
}