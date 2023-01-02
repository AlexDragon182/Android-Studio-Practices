package com.example.android_studio_practices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.ImageviewsBinding

class ImageViews : AppCompatActivity() {

    private lateinit var binding: ImageviewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ImageviewsBinding.inflate(layoutInflater)
        setContentView(binding.root)


            binding.btnAddImage.setOnClickListener(){
            binding.ivCat.setImageResource(R.drawable.Cat)

        }
    }

}
