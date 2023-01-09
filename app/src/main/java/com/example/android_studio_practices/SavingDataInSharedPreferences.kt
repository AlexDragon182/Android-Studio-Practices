package com.example.android_studio_practices

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.ActivitySavingDataInSharedPreferencesBinding

class SavingDataInSharedPreferences : AppCompatActivity() {
    private lateinit var binding: ActivitySavingDataInSharedPreferencesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySavingDataInSharedPreferencesBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        binding.btnSave.setOnClickListener(){
            val name = binding.etName1.toString()
            val age = binding.etAge1.text.toString().toInt()
            val isAdult = binding.cbAdult.isChecked

            editor.apply{
                putString("name",name)
                putInt("age",age)
                putBoolean("isAdult?",isAdult)
                apply()
            }
        }
        binding.btnLoad.setOnClickListener(){
            val name = sharedPref.getString("name",null)
            val age = sharedPref.getInt("age",0)
            val isAdult = sharedPref.getBoolean("isAdult",false)

            binding.etName1.setText(name)
            binding.etAge1.setText(age.toString())
            binding.cbAdult.isChecked = isAdult
        }
    }
}