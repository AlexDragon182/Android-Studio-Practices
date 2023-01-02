package com.example.android_studio_practices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.ActivityPassingDataToThisBinding

class Passing_Data_to_this : AppCompatActivity() {

    private lateinit var binding: ActivityPassingDataToThisBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPassingDataToThisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE",0)
        val country = intent.getStringExtra("EXTRA_COUNTRY")
        val personString = "$name,is $age and lives in $country"
        val person1 = intent.getSerializableExtra("EXTRA_PERSON") as Person
        binding.tvPersonData.text = personString
        binding.tvPersonData2.text = person1.toString()

    }
}