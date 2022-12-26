package com.example.android_studio_practices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ImageViews : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.imageviews)

        btnAddImage.SetonClickListenet{
            ivCat.setImgaeResource(R.drawable.Cat)

        }
    }

}
