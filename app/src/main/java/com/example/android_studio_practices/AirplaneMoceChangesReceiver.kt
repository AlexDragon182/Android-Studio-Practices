package com.example.android_studio_practices

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast.makeText
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG

class AirplaneMoceChangesReceiver : BroadcastReceiver {


    override fun onReceive(context: Context?, intent: Intent?){
        val isAirplaneModeEnabled = intent?.getBooleanArrayExtra("state" , false)?:return
        if(isAirplaneModeEnabled){
            Toast.makeText(context,"Airplane mode enabled", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context,"Airplane mode disabled", Toast.LENGTH_LONG).show()
        }
    }
}