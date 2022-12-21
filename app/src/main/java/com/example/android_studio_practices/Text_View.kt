package com.example.android_studio_practices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Text_View : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.text_view)

        var count = 0

        btnincrease.setOnClickListener{
            count++
            tvCount.text = "at tcount of 10 so $count"
        }
    }

}
