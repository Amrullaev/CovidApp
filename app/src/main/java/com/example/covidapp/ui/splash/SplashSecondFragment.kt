package com.example.covidapp.ui.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.covidapp.R
import com.example.covidapp.databinding.FragmentSplashFirstBinding
import com.example.covidapp.databinding.FragmentSplashSecondBinding


class SplashSecondFragment : Fragment() {
    private var _binding: FragmentSplashSecondBinding? = null
    private val binding get() = requireNotNull(_binding)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSplashSecondBinding.inflate(layoutInflater)
        binding.getStartedBtn.setOnClickListener {
            findNavController().navigate(R.id.splashThirdFragment)
        }
        return binding.root
    }


}