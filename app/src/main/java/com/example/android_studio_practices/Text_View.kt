package com.example.android_studio_practices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.TextViewBinding

class Text_View : AppCompatActivity() {

    private lateinit var binding: TextViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TextViewBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var count = 0

        binding.btnincrease.setOnClickListener{
            count++
            binding.tvCount.text = "at tcount of 10 so $count"
        }
    }

}
