package com.example.android_studio_practices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import com.example.android_studio_practices.FirstFragment.Companion.ADDRESS_BUNDLE
import com.example.android_studio_practices.FirstFragment.Companion.NAME_BUNDLE
import com.example.android_studio_practices.databinding.ActivityFragmentsBinding


class Fragments : AppCompatActivity() {

    private lateinit var binding: ActivityFragmentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        if(savedInstanceState == null){


        super.onCreate(savedInstanceState)
        binding = ActivityFragmentsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val bundle = bundleOf(NAME_BUNDLE to "Development", ADDRESS_BUNDLE to "mi canton")
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<FirstFragment>(R.id.fragmentViewer,bundle)

        }
        }

    }

}