package com.demo.runningtrackerapp.presentation.staticitcs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.demo.runningtrackerapp.databinding.FragmentSetupsBinding
import com.demo.runningtrackerapp.databinding.FragmentStaticiticsBinding
import com.demo.runningtrackerapp.utils.TrackingUtil
import dagger.hilt.android.AndroidEntryPoint
import kotlin.math.round

@AndroidEntryPoint
class StatisticsFragment : Fragment() {
  private lateinit var viewBinding: FragmentStaticiticsBinding
  private val viewModel: StatisticsViewModel by viewModels()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    viewBinding = FragmentStaticiticsBinding.inflate(inflater, container, false)
    return viewBinding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    initObservers()
  }

  private fun initObservers() {
    viewModel.totalTimeRun.observe(viewLifecycleOwner, {
      it?.let {
        val totalTime = TrackingUtil.getFormattedStopWatchTime(it)
        viewBinding.tvTotalTime.text = totalTime
      }
    })
    viewModel.totalDistance.observe(viewLifecycleOwner, {
      it?.let {
        val km = it / 1000f
        val totalDistance = round(km * 10f) / 10f
        val totalDistanceText = "${totalDistance}km"
        viewBinding.tvTotalDistance.text = totalDistanceText
      }
    })
    viewModel.totalAvgSpeed.observe(viewLifecycleOwner, {
      it?.let {
        val avgSpeed = round(it * 10f) / 10f
        val avgSpeedText = "${avgSpeed}km/h"
        viewBinding.tvAverageSpeed.text = avgSpeedText
      }
    })
    viewModel.totalCaloriesBurned.observe(viewLifecycleOwner, {
      it?.let {
        val caloriesBurnedText = "${it}kcal"
        viewBinding.tvTotalCalories.text = caloriesBurnedText
      }
    })
  }
}