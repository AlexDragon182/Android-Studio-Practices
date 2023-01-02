package com.example.android_studio_practices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.EdditextBinding

class Edit_Text : AppCompatActivity() {

    private lateinit var binding: EdditextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = EdditextBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSum.setOnClickListener(){
            val firstNumber = binding.etn1.text.toString().toInt()
            val secondNumber = binding.etn2.text.toString().toInt()
            val result = firstNumber + secondNumber

            binding.Result.text = result.toString()
        }
    }

}
