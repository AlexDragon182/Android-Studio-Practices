package com.example.android_studio_practices



import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {//activities are a single screen on the device.
    //class that describes what an activity is
    //other activity will have its own on create function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity","this is our first log message") // to create log messages
        setContentView(R.layout.activity_main)//layout type




    }//comments
    // Ctrl + O to ovewrite functions of an activity

    override fun onPause() {
        super.onPause()

        println("on Pause")
    }
}
//Activities :

//nothing more than a kotlin class that represents that activity and we should describe how to behave in certain situations

//Activity Stack : activities are pushed on top of first activity (FIRST, SECOND, THIRD) that is how android remembers

//Activity Lyfe Cycle : Started -> OnCreate() -> onStart() -> onResume() -> ActivityRunning -> onPause() -> onStop() -> onDestroy() -> Activity ShutDown

// when on onPause() looses focus it returns to onResume(), if system kills and need to sabe data use onPause()

// a new activity will start from our activity or a new activity will start from the system onStop() ->App Killed Process-> OnCreate()

//if the user navigates back onStop -> onRestart -> onStart->

// Errors :

//Logcat Emulator Proyect Log Level

// error has a statement and you want to search the last Caused by

//grey links belong to framework and blue links belong to proyect(can help)

//to use a button you need to assign an ID

