package com.example.android_studio_practices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class Toast : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toast)

        btnshowtoast.SetonClickListenet{
            Toast.makeText(this, "Hi Toast",Toast.LENGTH_LONG).show()

            Toast(this).apply{
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.custom_toast,clToast)
                show()
            }

        }
    }

}
