package com.demo.runningtrackerapp.presentation.setup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.demo.runningtrackerapp.databinding.FragmentSetupsBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_setups.*

@AndroidEntryPoint

class SetupFragment : Fragment() {
    private lateinit var viewBinding: FragmentSetupsBinding

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
        initListener()
    }

    private fun initListener() {
        tvContinue.setOnClickListener {
            goToMainFragment()
        }
    }

    private fun goToMainFragment() {
        findNavController().navigate(SetupFragmentDirections.navigateToMainFragment())
    }
}