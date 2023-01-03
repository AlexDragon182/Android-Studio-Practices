package com.example.android_studio_practices

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.ActivitySpinnerBinding

class Spinner : AppCompatActivity() {

    private lateinit var binding: ActivitySpinnerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpinnerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val customList = listOf("First","Second","Third","Fourth")
        val adapter = ArrayAdapter<String> (this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,customList)
        binding.spnMonth.adapter = adapter

        binding.spnMonth.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                android.widget.Toast.makeText(this@Spinner,"you selected ${parent?.getItemAtPosition(position).toString()}",android.widget.Toast.LENGTH_SHORT).show()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}