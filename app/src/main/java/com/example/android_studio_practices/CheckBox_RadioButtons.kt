package com.example.android_studio_practices

import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class CheckBox_RadioButtons : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkbox_radiobuttons)

    btnOrder.setOnClickListener() {
        val checkedradioMeatGroupId = rgMeat.checkedRadioButtonId
        val meat = findViewById<RadioButton>(checkedradioMeatGroupId)
        val cheese = cbCheese.isChecked
        val onions = cbOnions.isChecked
        val salad = cbSalad.isChecked
        val orderString = "You ordered your burger with \n" + "${meat.text}"+
                (if(cheese) "\nCheese" else "")
        (if(onions) "\nOnions" else "")
        (if(salad) "\nSalad" else "")

        }
    }

}