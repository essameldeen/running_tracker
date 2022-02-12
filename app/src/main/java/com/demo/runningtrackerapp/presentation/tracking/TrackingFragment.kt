package com.demo.runningtrackerapp.presentation.tracking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.demo.runningtrackerapp.databinding.FragmentTrackingBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment  : Fragment(){
    private lateinit var viewBinding: FragmentTrackingBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentTrackingBinding.inflate(inflater, container, false)
        return viewBinding.root
    }

}