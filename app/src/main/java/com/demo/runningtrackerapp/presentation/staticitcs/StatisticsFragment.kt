package com.demo.runningtrackerapp.presentation.staticitcs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.demo.runningtrackerapp.databinding.FragmentSetupsBinding
import com.demo.runningtrackerapp.databinding.FragmentStaticiticsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class StatisticsFragment : Fragment() {
    private lateinit var viewBinding: FragmentStaticiticsBinding
    private val viewModel: StatisticsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentStaticiticsBinding.inflate(inflater, container, false)
        return viewBinding.root
    }
}