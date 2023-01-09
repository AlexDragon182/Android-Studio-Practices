package com.example.android_studio_practices

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

open class Service1: Service() {
    val TAG = "MyService"

    init{
        Log.d(TAG,"Service is running")
    }

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        val dataString = intent?.getStringExtra("EXTRA_DATA")
        dataString?.let {
            Log.d(TAG,dataString)
        }
        return START_STICKY
    }
}