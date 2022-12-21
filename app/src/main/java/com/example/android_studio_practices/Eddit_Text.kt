package com.example.android_studio_practices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Eddit_Text : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.text_view)

        btnSum.SetonClickListenet{
            val firstNumber = etn1.text.toString().toInt()
            val secondNumber = etn2.text.toString.toInt()
            val result = firstNumber + secondNumber

            Result.text = result.toString()
        }
    }

}
