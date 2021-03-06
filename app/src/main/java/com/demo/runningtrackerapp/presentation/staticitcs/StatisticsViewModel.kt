package com.demo.runningtrackerapp.presentation.staticitcs

import androidx.lifecycle.ViewModel
import com.demo.runningtrackerapp.repository.MainRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel

class StatisticsViewModel @Inject constructor(
  private val mainRepo: MainRepo
) : ViewModel() {

  val totalTimeRun = mainRepo.getTotalTimeInMillis()
  val totalDistance = mainRepo.getTotalDistance()
  val totalCaloriesBurned = mainRepo.getTotalCaloriesBurned()
  val totalAvgSpeed = mainRepo.getTotalAvgSpeed()

  val runSortedByDate = mainRepo.getAllRunsSortedByDate()


}