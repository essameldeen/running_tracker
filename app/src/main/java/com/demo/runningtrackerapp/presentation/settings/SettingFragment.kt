package com.demo.runningtrackerapp.presentation.settings

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.demo.runningtrackerapp.databinding.FragmentSettingsBinding
import com.demo.runningtrackerapp.utils.Constants.KEY_NAME
import com.demo.runningtrackerapp.utils.Constants.KEY_WEIGHT
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class SettingFragment : Fragment() {
  private lateinit var viewBinding: FragmentSettingsBinding

  @Inject
  lateinit var sharedPref: SharedPreferences
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    viewBinding = FragmentSettingsBinding.inflate(inflater, container, false)
    return viewBinding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    initListener()
    getDataFromSharedPref()


  }

  private fun initListener() {
    viewBinding.btnApplyChanges.setOnClickListener {
      if (!updateDataOnSharedPref()) {
        showMessage("Pleas Fill Your name and Weight please!")
      } else {
        showMessage("Saved Change")
      }
    }
  }

  private fun getDataFromSharedPref() {
    val name = sharedPref.getString(KEY_NAME, "")
    val weight = sharedPref.getFloat(KEY_WEIGHT, 80F)
    updateView(name, weight)
  }

  private fun updateView(name: String?, weight: Float) {
    viewBinding.etName.setText(name)
    viewBinding.etWeight.setText(weight.toString())
  }

  private fun updateDataOnSharedPref(): Boolean {
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
      .apply()
  }

  private fun setUpToolBarView(name: String) {
    val toolBarText = "Let`s go, $name"
    requireActivity().tvToolbarTitle.text = toolBarText
  }

  private fun showMessage(message: String) {
    Toast.makeText(
      requireContext(),
      message,
      Toast.LENGTH_LONG
    ).show()
  }
}