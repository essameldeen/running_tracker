package com.demo.runningtrackerapp.data.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Timestamp


@Entity(tableName = "running_table")
class Run(
    var image: Bitmap? = null,
    var timeStamp: Long = 0L,
    var avgSpeedInKMH: Float = 0F,
    var distanceInMeter: Int = 0,
    var timeMillis: Long = 0L,
    var caloriesBurned: Int = 0


) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}