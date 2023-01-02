package com.example.android_studio_practices

import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.CheckboxRadiobuttonsBinding

class CheckBox_RadioButtons : AppCompatActivity() {

    private lateinit var binding: CheckboxRadiobuttonsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CheckboxRadiobuttonsBinding.inflate(layoutInflater)
        setContentView(binding.root)

    binding.btnOrder.setOnClickListener() {
        val checkedradioMeatGroupId = binding.rgMeat.checkedRadioButtonId
        val meat = findViewById<RadioButton>(checkedradioMeatGroupId)
        val cheese = binding.checkBox2.isChecked
        val onions = binding.checkBox.isChecked
        val salad = binding.checkBox3.isChecked
        val orderString = "You ordered your burger with \n" + "${meat.text}"+
                (if(cheese) "\nCheese" else "")
        (if(onions) "\nOnions" else "")
        (if(salad) "\nSalad" else "")

        }
    }

}