package com.example.android_studio_practices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.ActivityAlertDialogBinding

class Alert_Dialog : AppCompatActivity() {

    private lateinit var binding: ActivityAlertDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlertDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val addContactDialog = Alert_Dialog.Builder
    }
}