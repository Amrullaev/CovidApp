package com.example.covidapp.ui.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.covidapp.R
import com.example.covidapp.databinding.FragmentMainSplashBinding
import com.example.covidapp.databinding.FragmentSplashFirstBinding
import com.example.covidapp.ui.splash.adapter.SplashPagerdapter
import com.google.android.material.tabs.TabLayoutMediator


class MainSplashFragment : Fragment() {
    private var _binding: FragmentMainSplashBinding? = null
    private val binding get() = requireNotNull(_binding)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainSplashBinding.inflate(layoutInflater)
        val splashFragment =
            SplashPagerdapter(requireActivity().supportFragmentManager, this.lifecycle)
        binding.viewpager.adapter = splashFragment

        TabLayoutMediator(binding.tabLayout, binding.viewpager) { _, _ ->

        }.attach()
        return binding.root
    }

}