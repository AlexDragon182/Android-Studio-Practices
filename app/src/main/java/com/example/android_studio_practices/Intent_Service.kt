package com.example.android_studio_practices

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.ActivityIntentServiceBinding

class Intent_Service : AppCompatActivity() {
    private lateinit var binding: ActivityIntentServiceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityIntentServiceBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnSTART.setOnClickListener(){
            Intent(this,ServicetoIntent :: class.java).also {
                startService(it)
                binding.tvServiceInfo.text = "Service running"
            }
        }

        binding.btnSTOP.setOnClickListener(){
            ServicetoIntent.stopService()
            binding.tvServiceInfo.text = "Service STOP"
        }
        binding.btnSendData.setOnClickListener(){
            Intent(this,ServicetoIntent :: class.java).also {
                val dataString = binding.etDataString.toString()
                it.putExtra("EXTRA_DATA",dataString)
                startService(it)

            }
        }
    }
}
