package com.example.android_studio_practices

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.PassingdatabetweenactivitiesBinding

class Passing_Data_Between_Activities : AppCompatActivity() {

    private lateinit var binding: PassingdatabetweenactivitiesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  PassingdatabetweenactivitiesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnApply.setOnClickListener() {
            val name = binding.etName.text.toString()
            val age = binding.etAge.text.toString().toInt()
            val country = binding.etCountry.text.toString()
            val person = Person(name,age,country)


            Intent(this,Passing_Data_to_this::class.java).also {
                it.putExtra("EXTRA_NAME",name)
                it.putExtra("EXTRA_AGE",age)
                it.putExtra("EXTRA_COUNTRY",country)
                it.putExtra("EXTRA_PERSON",person)
                startActivity(it)
            }
        }
    }

}