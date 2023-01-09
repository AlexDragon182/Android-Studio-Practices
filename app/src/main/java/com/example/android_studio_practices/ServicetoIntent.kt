package com.example.android_studio_practices

import android.app.IntentService
import android.content.Intent
import android.util.Log

class ServicetoIntent :  IntentService("ServicetoIntent"){

    init {
        instance = this
    }

    companion object {
        private lateinit var instance : ServicetoIntent
        var isRunning =  false
        fun stopService(){
            Log.d("MyIntentService", "Service is stopping...")
            isRunning = false
            instance.stopSelf()

        }
    }

    override fun onHandleIntent(intent: Intent?) {
        try {
            isRunning = true

            while(isRunning){
                Log.d("MyintentService","Service ir Running...")
                Thread.sleep(1000)

            }
        } catch (e : InterruptedException){
            Thread.currentThread().interrupt()
        }
    }
}