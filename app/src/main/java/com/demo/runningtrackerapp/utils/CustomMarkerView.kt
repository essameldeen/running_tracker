package com.demo.runningtrackerapp.utils

import android.content.Context
import com.demo.runningtrackerapp.data.db.Run
import com.github.mikephil.charting.components.MarkerView
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.highlight.Highlight
import com.github.mikephil.charting.utils.MPPointF
import kotlinx.android.synthetic.main.marker_view.view.*
import java.text.SimpleDateFormat
import java.util.*

class CustomMarkerView(
  private val runs: List<Run>,
  context: Context,
  layoutId: Int,
) : MarkerView(context, layoutId) {

  override fun getOffset(): MPPointF {
    return MPPointF(-width / 2f, -height.toFloat())

  }

  override fun refreshContent(e: Entry?, highlight: Highlight?) {
    super.refreshContent(e, highlight)
    if (e == null) return
    val currentRuId = e.x.toInt()
    val run = runs[currentRuId]
    val calender = Calendar.getInstance().apply {
      timeInMillis = run.timeStamp
    }
    val dateFormat = SimpleDateFormat("dd.MM.yy,", Locale.getDefault())
    tvDate.text = dateFormat.format(calender.time)

    val avgSpeed = "${run.avgSpeedInKMH}km/h"
    tvAvgSpeed.text = avgSpeed
    val distanceInKm = "${run.avgSpeedInKMH / 1000f}km"
    tvDistance.text = distanceInKm

    tvDuration.text = TrackingUtil.getFormattedStopWatchTime(run.timeMillis)

    val caloriesBurned = "${run.caloriesBurned}kcal"
    tvCaloriesBurned.text = caloriesBurned

  }
}