package com.demo.runningtrackerapp.presentation.tracking

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.demo.runningtrackerapp.R
import com.demo.runningtrackerapp.databinding.FragmentTrackingBinding
import com.demo.runningtrackerapp.utils.Constants.ACTION_PAUSE_SERVICE
import com.demo.runningtrackerapp.utils.Constants.ACTION_START_OR_RESUME_SERVICE
import com.demo.runningtrackerapp.utils.Constants.ACTION_STOP_SERVICE
import com.demo.runningtrackerapp.utils.Constants.MAP_ZOOM
import com.demo.runningtrackerapp.utils.Constants.POLYLINE_COLOR
import com.demo.runningtrackerapp.utils.Constants.POLYLINE_WIDTH
import com.demo.runningtrackerapp.utils.Polyline
import com.demo.runningtrackerapp.utils.TrackingService
import com.demo.runningtrackerapp.utils.TrackingUtil
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.PolylineOptions
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment : Fragment() {
    private lateinit var viewBinding: FragmentTrackingBinding
    private var googleMap: GoogleMap? = null

    private var isTracking = false
    private var pathPoints = mutableListOf<Polyline>()
    private var currentTimeInMills = 0L
    private var menu: Menu? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentTrackingBinding.inflate(inflater, container, false)
        setHasOptionsMenu(true)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding.mapView.onCreate(savedInstanceState)
        viewBinding.mapView.getMapAsync {
            googleMap = it
            addAllPolylines()
        }
        intiListener()
        initObservers()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.toolbar_menu, menu)
        this.menu = menu
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        super.onPrepareOptionsMenu(menu)

        if (currentTimeInMills > 0L) {
            makeMenuVisible()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.mi_cancelTracking -> showCancelDialog()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun intiListener() {
        viewBinding.btnToggleRun.setOnClickListener {
            toggleRun()
        }
    }

    private fun initObservers() {
        TrackingService.isTracking.observe(viewLifecycleOwner, {
            updateTracking(it)
        })
        TrackingService.pathPoints.observe(viewLifecycleOwner, {
            pathPoints = it
            addLatestPoint()
            moveTheCameraToPoint()
        })
        TrackingService.timeInMillSeconds.observe(viewLifecycleOwner, {
            currentTimeInMills = it
            val formatTimer = TrackingUtil.getFormattedStopWatchTime(currentTimeInMills, true)
            viewBinding.tvTimer.text = formatTimer
        })
    }

    private fun sendCommandToService(action: String) =
        Intent(requireContext(), TrackingService::class.java).also {
            it.action = action
            requireContext().startService(it)
        }


    private fun addAllPolylines() {
        for (polyline in pathPoints) {
            val polylineOptions = PolylineOptions()
                .color(POLYLINE_COLOR)
                .width(POLYLINE_WIDTH)
                .addAll(polyline)
            googleMap?.addPolyline(polylineOptions)
        }
    }

    private fun addLatestPoint() {
        if (pathPoints.isNotEmpty() && pathPoints.last().size > 1) {
            val preLastPoint = pathPoints.last()[pathPoints.last().size - 2]
            val lastPoint = pathPoints.last().last()

            val polylineOptions = PolylineOptions()
                .color(POLYLINE_COLOR)
                .width(POLYLINE_WIDTH)
                .add(preLastPoint)
                .add(lastPoint)

            googleMap?.addPolyline(polylineOptions)
        }
    }

    private fun moveTheCameraToPoint() {
        if (pathPoints.isNotEmpty() && pathPoints.last().isNotEmpty()) {
            googleMap?.animateCamera(
                CameraUpdateFactory.newLatLngZoom(
                    pathPoints.last().last(),
                    MAP_ZOOM
                )
            )
        }
    }

    private fun updateTracking(isTracking: Boolean) {
        this.isTracking = isTracking
        if (!isTracking) {
            viewBinding.btnToggleRun.text = "START"
            viewBinding.btnFinishRun.visibility = View.VISIBLE
        } else {
            viewBinding.btnToggleRun.text = "STOP"
            viewBinding.btnFinishRun.visibility = View.GONE
            makeMenuVisible()
        }
    }

    private fun toggleRun() {
        if (isTracking) {
            makeMenuVisible()
            sendCommandToService(ACTION_PAUSE_SERVICE)
        } else {
            sendCommandToService(ACTION_START_OR_RESUME_SERVICE)
        }
    }

    private fun showCancelDialog() {
        val dialog = MaterialAlertDialogBuilder(requireContext(), R.style.AlertDialogTheme)
            .setTitle("Cancel The Run ?")
            .setMessage("Are you sure to cancel the current run and delete all its data ?")
            .setIcon(R.drawable.ic_delete)
            .setPositiveButton("Yes") { _, _ ->
                stopRun()

            }.setNegativeButton("No") { dialogInterface, _ ->
                dialogInterface.cancel()
            }
            .create()
        dialog.show()
    }

    private fun makeMenuVisible() {
        menu?.getItem(0)?.isVisible = true
    }

    private fun stopRun() {
        sendCommandToService(ACTION_STOP_SERVICE)
        findNavController().navigate(TrackingFragmentDirections.navigateToMainFragment())
    }

    override fun onResume() {
        super.onResume()
        viewBinding.mapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        viewBinding.mapView.onPause()

    }

    override fun onStop() {
        super.onStop()
        viewBinding.mapView.onStop()

    }

    override fun onLowMemory() {
        super.onLowMemory()
        viewBinding.mapView.onLowMemory()

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        viewBinding.mapView.onSaveInstanceState(outState)

    }

    override fun onDestroy() {
        super.onDestroy()
        viewBinding.mapView.onDestroy()

    }

}