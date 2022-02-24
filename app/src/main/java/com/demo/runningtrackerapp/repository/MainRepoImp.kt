package com.demo.runningtrackerapp.repository

import androidx.lifecycle.LiveData
import com.demo.runningtrackerapp.data.model.Run
import com.demo.runningtrackerapp.data.db.RunDao
import javax.inject.Inject

class MainRepoImp @Inject constructor(private val dao: RunDao) : MainRepo {
  override suspend fun insertRun(run: Run) {
    dao.insert(run)
  }

  override suspend fun deleteRun(run: Run) {
    dao.delete(run)
  }

  override fun getAllRunsSortedByDate(): LiveData<List<Run>> = dao.getAllRunSortedByDate()

  override fun getAllRunsSortedByDistance(): LiveData<List<Run>> = dao.getAllRunSortedByDistance()

  override fun getAllRunsSortedByTimeInMillis(): LiveData<List<Run>> =
    dao.getAllRunSortedByTimeInMillis()

  override fun getAllRunsSortedByAvgSpeed(): LiveData<List<Run>> = dao.getAllRunSortedByAvgSpeed()

  override fun getAllRunsSortedByCaloriesBurned(): LiveData<List<Run>> =
    dao.getAllRunSortedByCaloriesBurned()

  override fun getTotalAvgSpeed(): LiveData<Float> = dao.getTotalAverageSpeed()


  override fun getTotalDistance(): LiveData<Int> = dao.getTotalInDistanceInMeter()

  override fun getTotalCaloriesBurned(): LiveData<Int> = dao.getTotalInCaloriesBurned()

  override fun getTotalTimeInMillis(): LiveData<Long> = dao.getTotalInMillis()
}