package com.example.android_studio_practices

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.ActivityImplicitIntentsBinding

class Implicit_Intents : AppCompatActivity() {

    private lateinit var binding: ActivityImplicitIntentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImplicitIntentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTakePhoto.setOnClickListener(){
         Intent(Intent.ACTION_GET_CONTENT).also {
            it.type = "image/*"
                startActivityForResult(it,0)


         }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == Activity.RESULT_OK && requestCode == 0){
            val uri = data?.data
            binding.ivPhoto.setImageURI(uri)
        }
    }

}
