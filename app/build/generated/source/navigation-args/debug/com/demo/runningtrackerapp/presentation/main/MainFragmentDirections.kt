package com.demo.runningtrackerapp.presentation.main

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.demo.runningtrackerapp.NavGraphDirections
import com.demo.runningtrackerapp.R

public class MainFragmentDirections private constructor() {
  public companion object {
    public fun navigateToTrackingFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.navigate_to_trackingFragment)

    public fun globalActionToTrackingFragment(): NavDirections =
        NavGraphDirections.globalActionToTrackingFragment()
  }
}
