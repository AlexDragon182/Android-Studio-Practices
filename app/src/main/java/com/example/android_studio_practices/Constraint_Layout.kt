package com.example.android_studio_practices

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity


class Constraint_Layout  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.constraint_layout)

        btnSumbit.setOnClickListener {
            val firstname = editextFirstName.text.toString()
            val secondname = edittextLastName.text.toString()
            val dateofbirth = edittextDateofBirth.text.toString()
            val postalcode = edittextPostalCode.text.toString()
            log.d("constraint_layout","$firstname,$secondname,$dateofbirth,$postalcode")
        }
    }
}