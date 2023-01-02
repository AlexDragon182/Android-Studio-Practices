package com.example.android_studio_practices

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.ActivityIntentsAndStartingActivitiesBinding

class Intents_and_Starting_Activities : AppCompatActivity() {

    private lateinit var binding: ActivityIntentsAndStartingActivitiesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentsAndStartingActivitiesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenActivity.setOnClickListener(){
            Intent(this,WillBeOpen_Activity::class.java).also{
                startActivity(it)
            }
        }
    }
}