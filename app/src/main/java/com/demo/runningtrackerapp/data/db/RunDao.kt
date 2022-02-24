package com.demo.runningtrackerapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.demo.runningtrackerapp.data.model.Run

@Dao
interface RunDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(run: Run)

    @Delete
    suspend fun delete(run: Run)

    @Query("SELECT * FROM running_table ORDER BY timeStamp DESC")
    fun getAllRunSortedByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY timeMillis DESC")
    fun getAllRunSortedByTimeInMillis(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY caloriesBurned DESC")
    fun getAllRunSortedByCaloriesBurned(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY distanceInMeter DESC")
    fun getAllRunSortedByDistance(): LiveData<List<Run>>

  @Query("SELECT * FROM running_table ORDER BY avgSpeedInKMH DESC")
  fun getAllRunSortedByAvgSpeed(): LiveData<List<Run>>


    @Query("SELECT sum(timeMillis) FROM running_table")
    fun getTotalInMillis(): LiveData<Long>

    @Query("SELECT sum(caloriesBurned) FROM running_table")
    fun getTotalInCaloriesBurned(): LiveData<Int>

    @Query("SELECT sum(distanceInMeter) FROM running_table")
    fun getTotalInDistanceInMeter(): LiveData<Int>

    @Query("SELECT AVG(avgSpeedInKMH) FROM running_table")
    fun getTotalAverageSpeed(): LiveData<Float>


}