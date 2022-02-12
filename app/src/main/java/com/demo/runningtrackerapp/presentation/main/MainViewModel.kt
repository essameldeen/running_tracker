package com.demo.runningtrackerapp.presentation.main

import androidx.lifecycle.ViewModel
import com.demo.runningtrackerapp.repository.MainRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepo
) : ViewModel() {

}