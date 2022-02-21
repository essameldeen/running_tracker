package com.demo.runningtrackerapp.presentation.staticitcs

import androidx.navigation.NavDirections
import com.demo.runningtrackerapp.NavGraphDirections

public class StatisticsFragmentDirections private constructor() {
  public companion object {
    public fun globalActionToTrackingFragment(): NavDirections =
        NavGraphDirections.globalActionToTrackingFragment()
  }
}
