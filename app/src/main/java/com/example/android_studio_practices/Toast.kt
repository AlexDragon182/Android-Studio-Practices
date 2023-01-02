package com.example.android_studio_practices

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.CustomToastBinding
import com.example.android_studio_practices.databinding.ToastBinding

@Suppress("DEPRECATION")
class Toast : AppCompatActivity() {

    private lateinit var binding: ToastBinding
    private lateinit var binding2: CustomToastBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ToastBinding.inflate(layoutInflater)
        binding2 = CustomToastBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.btnshowtoast.setOnClickListener(){
            Toast.makeText(this, "Hi Toast",Toast.LENGTH_LONG).show()

            Toast(this).apply{
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.custom_toast,binding2.clToast)
                show()
            }

        }
    }

}
