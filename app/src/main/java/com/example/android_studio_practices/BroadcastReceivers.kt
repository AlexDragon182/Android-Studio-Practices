package com.example.android_studio_practices

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.ActivityBroadcastReceiversBinding

class BroadcastReceivers : AppCompatActivity() {
    lateinit var receiver : AirplaneMoceChangesReceiver
    private lateinit var binding: ActivityBroadcastReceiversBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityBroadcastReceiversBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        receiver = AirplaneMoceChangesReceiver()

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(receiver,it)
        }
    }
    override  fun onStop(){
        super.onStop()
        unregisterReceiver(receiver)
    }


}