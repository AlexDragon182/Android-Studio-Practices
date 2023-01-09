package com.example.android_studio_practices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.android_studio_practices.databinding.ActivityBottomNavigationViewBinding

class BottomNavigationView : AppCompatActivity() {

    private lateinit var binding: ActivityBottomNavigationViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavigationViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstFragment = HomeFragment
        val secondFragment = ProfileFragment
        val thirdFragment = MessageFragment

        //setCurrentFragment(firstFragment)

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                //R.id.miHome -> setCurrentFragment(firstFragment)
                //R.id.miProfile -> setCurrentFragment(secondFragment)
                //R.id.miMessages -> setCurrentFragment(thirdFragment)
            }
            true
        }

        binding.bottomNavigationView.getOrCreateBadge(R.id.miMessages).apply {
            number = 10
        }


    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
        }
}

