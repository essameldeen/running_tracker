package com.demo.runningtrackerapp.repository

import androidx.lifecycle.LiveData
import com.demo.runningtrackerapp.data.db.Run
import com.demo.runningtrackerapp.data.db.RunDao
import javax.inject.Inject

class MainRepoImp @Inject constructor(private val dao: RunDao) : MainRepo {
    override suspend fun insertRun(run: Run) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteRun(run: Run) {
        TODO("Not yet implemented")
    }

    override fun getAllRunsSortedByDate(): LiveData<List<Run>> {
        TODO("Not yet implemented")
    }

    override fun getAllRunsSortedByDistance(): LiveData<List<Run>> {
        TODO("Not yet implemented")
    }

    override fun getAllRunsSortedByTimeInMillis(): LiveData<List<Run>> {
        TODO("Not yet implemented")
    }

    override fun getAllRunsSortedByAvgSpeed(): LiveData<List<Run>> {
        TODO("Not yet implemented")
    }

    override fun getAllRunsSortedByCaloriesBurned(): LiveData<List<Run>> {
        TODO("Not yet implemented")
    }

    override fun getTotalAvgSpeed(): LiveData<Float> {
        TODO("Not yet implemented")
    }

    override fun getTotalDistance(): LiveData<Int> {
        TODO("Not yet implemented")
    }

    override fun getTotalCaloriesBurned(): LiveData<Int> {
        TODO("Not yet implemented")
    }

    override fun getTotalTimeInMillis(): LiveData<Long> {
        TODO("Not yet implemented")
    }
}