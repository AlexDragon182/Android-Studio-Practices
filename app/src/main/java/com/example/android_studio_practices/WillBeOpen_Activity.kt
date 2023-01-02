package com.example.android_studio_practices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.ActivityWillbeopenBinding

class WillBeOpen_Activity : AppCompatActivity(){

    private lateinit var binding: ActivityWillbeopenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWillbeopenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGoBack.setOnClickListener(){
            finish()
        }
    }
}