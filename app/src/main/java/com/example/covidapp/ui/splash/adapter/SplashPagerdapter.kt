package com.example.covidapp.ui.splash.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.covidapp.ui.splash.SplashFirstFragment
import com.example.covidapp.ui.splash.SplashSecondFragment
import com.example.covidapp.ui.splash.SplashThirdFragment

class SplashPagerdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> SplashFirstFragment()
            1 -> SplashSecondFragment()
            2 -> SplashThirdFragment()
            else -> SplashFirstFragment()
        }
    }

}