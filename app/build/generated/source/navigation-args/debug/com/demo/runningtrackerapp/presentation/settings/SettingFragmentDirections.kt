package com.demo.runningtrackerapp.presentation.settings

import androidx.navigation.NavDirections
import com.demo.runningtrackerapp.NavGraphDirections

public class SettingFragmentDirections private constructor() {
  public companion object {
    public fun globalActionToTrackingFragment(): NavDirections =
        NavGraphDirections.globalActionToTrackingFragment()
  }
}
