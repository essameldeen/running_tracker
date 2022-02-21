package com.demo.runningtrackerapp

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class NavGraphDirections private constructor() {
  public companion object {
    public fun globalActionToTrackingFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.globalAction_to_trackingFragment)
  }
}
