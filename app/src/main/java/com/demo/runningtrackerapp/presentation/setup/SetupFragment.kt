package com.demo.runningtrackerapp.presentation.setup

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.demo.runningtrackerapp.R
import com.demo.runningtrackerapp.databinding.FragmentSetupsBinding
import com.demo.runningtrackerapp.utils.Constants.KEY_FIRST_TIME_TOGGLE
import com.demo.runningtrackerapp.utils.Constants.KEY_NAME
import com.demo.runningtrackerapp.utils.Constants.KEY_WEIGHT
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_setups.*
import javax.inject.Inject

@AndroidEntryPoint
class SetupFragment : Fragment() {
  private lateinit var viewBinding: FragmentSetupsBinding

  @Inject
  lateinit var sharedPref: SharedPreferences

  @set:Inject
  var isFirstAppOpen = true

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    viewBinding = FragmentSetupsBinding.inflate(inflater, container, false)
    return viewBinding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    if (!isFirstAppOpen) {
      val navOptions = NavOptions.Builder()
        .setPopUpTo(R.id.setupFragment, true)
        .build()

      goToMainFragmentSecond(savedInstanceState, navOptions)
    }
    initListener()
  }

  private fun goToMainFragmentSecond(savedInstanceState: Bundle?, navOptions: NavOptions) {
    findNavController().navigate(
      R.id.navigate_to_mainFragment,
      savedInstanceState,
      navOptions
    )
  }

  private fun initListener() {
    tvContinue.setOnClickListener {
      if (getPersonalData())
        goToMainFragmentFirst()
      else
        showErrorMessage()
    }
  }


  private fun getPersonalData(): Boolean {
    val name = viewBinding.etName.text.toString()
    val weight = viewBinding.etWeight.text.toString()

    if (name.isEmpty() || weight.isEmpty()) return false


    saveToSharedPre(name, weight.toFloat())
    setUpToolBarView(name)

    return true

  }

  private fun saveToSharedPre(name: String, weight: Float) {
    sharedPref.edit()
      .putString(KEY_NAME, name)
      .putFloat(KEY_WEIGHT, weight)
      .putBoolean(KEY_FIRST_TIME_TOGGLE, false)
      .apply()
  }

  private fun setUpToolBarView(name: String) {
    val toolBarText = "Let`s go, $name"
    requireActivity().tvToolbarTitle.text = toolBarText
  }

  private fun showErrorMessage() {
    Toast.makeText(
      requireContext(),
      "Pleas Fill Your name and Weight please!",
      Toast.LENGTH_LONG
    ).show()
  }

  private fun goToMainFragmentFirst() {
    findNavController().navigate(SetupFragmentDirections.navigateToMainFragment())
  }
}