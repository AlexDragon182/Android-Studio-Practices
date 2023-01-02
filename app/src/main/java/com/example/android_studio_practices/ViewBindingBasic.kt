package com.example.android_studio_practices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.ViewbindingbasicBinding


class ViewBindingBasic : AppCompatActivity() {

    private lateinit var binding: ViewbindingbasicBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ViewbindingbasicBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvHelloWorld




    }
}