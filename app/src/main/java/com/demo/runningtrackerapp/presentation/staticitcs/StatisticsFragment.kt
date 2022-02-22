package com.demo.runningtrackerapp.presentation.staticitcs

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.demo.runningtrackerapp.R
import com.demo.runningtrackerapp.data.db.Run
import com.demo.runningtrackerapp.databinding.FragmentStaticiticsBinding
import com.demo.runningtrackerapp.utils.Constants.MARKER_VIEW
import com.demo.runningtrackerapp.utils.CustomMarkerView
import com.demo.runningtrackerapp.utils.TrackingUtil
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
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
    setUpViewChart()
  }

  private fun setUpViewChart() {
    viewBinding.barChart.xAxis.apply {
      position = XAxis.XAxisPosition.BOTTOM
      setDrawLabels(false)
      axisLineColor = Color.WHITE
      textColor = Color.WHITE
      setDrawGridLines(false)

    }

    viewBinding.barChart.axisLeft.apply {
      axisLineColor = Color.WHITE
      textColor = Color.WHITE
      setDrawGridLines(false)
    }
    viewBinding.barChart.axisRight.apply {
      axisLineColor = Color.WHITE
      textColor = Color.WHITE
      setDrawGridLines(false)
    }
    viewBinding.barChart.apply {
      description.text = "Avg Speed Over Time"
      legend.isEnabled = false
    }
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
    viewModel.runSortedByDate.observe(viewLifecycleOwner, {
      val allAvgSpeed = it.indices.map { i -> BarEntry(i.toFloat(), it[i].avgSpeedInKMH) }
      initBarData(allAvgSpeed, it)

    })
  }

  private fun initBarData(allAvgSpeed: List<BarEntry>, listOfRuns: List<Run>) {
    val barDataSet = BarDataSet(allAvgSpeed, "Avg Speed Over Time").apply {
      valueTextColor = Color.WHITE
      color = ContextCompat.getColor(requireContext(), R.color.colorAccent)
    }
    viewBinding.barChart.data = BarData(barDataSet)
    viewBinding.barChart.marker = CustomMarkerView(
      listOfRuns.reversed(), requireContext(), MARKER_VIEW
    )
    viewBinding.barChart.invalidate()
  }
}