package com.example.android_studio_practices

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.ConstraintLayoutBinding


class Constraint_Layout  : AppCompatActivity() {

    private lateinit var binding: ConstraintLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding =  ConstraintLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSumbit.setOnClickListener {
            val firstname = binding.editextFirstName.text.toString()
            val secondname = binding.edittextLastName.text.toString()
            val dateofbirth = binding.edittextDateofBirth.text.toString()
            val postalcode = binding.edittextPostalCode.text.toString()
            println("$firstname,$secondname,$dateofbirth,$postalcode")
        }
    }
}