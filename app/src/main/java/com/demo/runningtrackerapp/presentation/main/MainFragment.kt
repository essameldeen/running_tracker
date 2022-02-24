package com.demo.runningtrackerapp.presentation.main

import android.Manifest
import android.app.AlertDialog
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.demo.runningtrackerapp.databinding.FragmentMainBinding
import com.demo.runningtrackerapp.utils.Constants.REQUEST_CODE_LOCATION_PERMISSION
import com.demo.runningtrackerapp.utils.SortType
import com.demo.runningtrackerapp.utils.TrackingUtil
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main.*
import pub.devrel.easypermissions.AppSettingsDialog
import pub.devrel.easypermissions.EasyPermissions

@AndroidEntryPoint
class MainFragment : Fragment(), EasyPermissions.PermissionCallbacks {
  private val mainViewModel: MainViewModel by viewModels()
  private lateinit var viewBinding: FragmentMainBinding
  private lateinit var runAdapter: RunAdapter

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    viewBinding = FragmentMainBinding.inflate(inflater, container, false)
    return viewBinding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    requestPermission()
    initView()
    initListener()
    initObservers()
  }

  private fun initView() {
    when (mainViewModel.sortType) {
      SortType.DATE -> viewBinding.spFilter.setSelection(0)
      SortType.RUNNING_TIME -> viewBinding.spFilter.setSelection(1)
      SortType.DISTANCE -> viewBinding.spFilter.setSelection(2)
      SortType.AVG_SPEED -> viewBinding.spFilter.setSelection(3)
      SortType.CALORIES_BURNED -> viewBinding.spFilter.setSelection(4)
    }


    runAdapter = RunAdapter()
    viewBinding.rvRuns.apply {
      adapter = runAdapter
      layoutManager = LinearLayoutManager(requireContext())

    }
  }

  private fun initListener() {
    viewBinding.spFilter.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
      override fun onNothingSelected(p0: AdapterView<*>?) {}
      override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, pos: Int, id: Long) {
        when (pos) {
          0 -> mainViewModel.sortRuns(SortType.DATE)
          1 -> mainViewModel.sortRuns(SortType.RUNNING_TIME)
          2 -> mainViewModel.sortRuns(SortType.DISTANCE)
          3 -> mainViewModel.sortRuns(SortType.AVG_SPEED)
          4 -> mainViewModel.sortRuns(SortType.CALORIES_BURNED)
        }
      }
    }


    fab.setOnClickListener {
      gotToTrackingFragment()
    }
  }


  private fun initObservers() {
    mainViewModel.runs.observe(viewLifecycleOwner, {
      if (!it.isNullOrEmpty())
        runAdapter.addList(it)
    })
  }

  private fun requestPermission() {
    if (TrackingUtil.hasLocationPermission(requireContext())) {
      return
    }
    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
      EasyPermissions.requestPermissions(
        this,
        "You need to accept location permissions to use this app.",
        REQUEST_CODE_LOCATION_PERMISSION,
        Manifest.permission.ACCESS_COARSE_LOCATION,
        Manifest.permission.ACCESS_FINE_LOCATION
      )
    } else {
      EasyPermissions.requestPermissions(
        this,
        "You need to accept location permissions to use this app.",
        REQUEST_CODE_LOCATION_PERMISSION,
        Manifest.permission.ACCESS_COARSE_LOCATION,
        Manifest.permission.ACCESS_FINE_LOCATION,
        Manifest.permission.ACCESS_BACKGROUND_LOCATION
      )
    }
  }

  override fun onPermissionsGranted(requestCode: Int, perms: MutableList<String>) {

    if (EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
      AppSettingsDialog.Builder(this).build().show()

    } else {
      requestPermission()
    }

  }

  override fun onPermissionsDenied(requestCode: Int, perms: MutableList<String>) {}
  override fun onRequestPermissionsResult(
    requestCode: Int,
    permissions: Array<out String>,
    grantResults: IntArray
  ) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this)
  }

  private fun gotToTrackingFragment() {
    findNavController().navigate(MainFragmentDirections.navigateToTrackingFragment())
  }


}