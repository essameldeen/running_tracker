package com.demo.runningtrackerapp.presentation.tracking

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.demo.runningtrackerapp.NavGraphDirections
import com.demo.runningtrackerapp.R

public class TrackingFragmentDirections private constructor() {
  public companion object {
    public fun navigateToMainFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.navigate_to_mainFragment)

    public fun globalActionToTrackingFragment(): NavDirections =
        NavGraphDirections.globalActionToTrackingFragment()
  }
}
