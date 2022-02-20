package com.demo.runningtrackerapp.presentation.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.*
import com.bumptech.glide.Glide
import com.demo.runningtrackerapp.R
import com.demo.runningtrackerapp.data.db.Run
import com.demo.runningtrackerapp.utils.TrackingUtil
import kotlinx.android.synthetic.main.fragment_staticitics.view.*
import kotlinx.android.synthetic.main.item_run.view.*
import java.text.SimpleDateFormat
import java.util.*

class RunAdapter : RecyclerView.Adapter<RunAdapter.ViewHolder>() {

    val differCallBack = object : DiffUtil.ItemCallback<Run>() {
        override fun areItemsTheSame(oldItem: Run, newItem: Run): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Run, newItem: Run): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

    }

    private val differ = AsyncListDiffer(this, differCallBack)

    fun addList(rus: List<Run>) = differ.submitList(rus)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_run, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val run = differ.currentList[position]
        holder.itemView.apply {
            Glide.with(this).load(run.image).into(ivRunImage)
            val calender = Calendar.getInstance().apply {
                timeInMillis = run.timeStamp
            }
            val dateFormat = SimpleDateFormat("dd.MM.yy,", Locale.getDefault())
            tvDate.text = dateFormat.format(calender.time)

            val avgSpeed = "${run.avgSpeedInKMH}km/h"
            tvAvgSpeed.text = avgSpeed
            val distanceInKm = "${run.avgSpeedInKMH / 1000f}km"
            tvDistance.text = distanceInKm

            tvTime.text = TrackingUtil.getFormattedStopWatchTime(run.timeMillis)

            val caloriesBurned = "${run.caloriesBurned}kcal"
            tvCalories.text = caloriesBurned


        }
    }

    override fun getItemCount(): Int = differ.currentList.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


}