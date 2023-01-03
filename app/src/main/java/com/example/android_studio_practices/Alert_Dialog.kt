package com.example.android_studio_practices

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.ActivityAlertDialogBinding

class Alert_Dialog : AppCompatActivity() {

    private lateinit var binding: ActivityAlertDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlertDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add contact")
            .setMessage("Do you want to add to Andy to your contacts")
            .setIcon(R.drawable.ic_addcontact2)
            .setPositiveButton("YES") { _, _ ->
                Toast.makeText(this, "you added  Andy to your contact list", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("NO") { _, _ ->
                Toast.makeText(this, "you di not added  Andy to your contact list", Toast.LENGTH_SHORT)
                    .show()
            }.create()
        binding.btnDialog1.setOnClickListener(){
            addContactDialog.show()
        }

        val option = arrayOf("First Item","Second Item","Third Item")
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose 1")
            .setSingleChoiceItems(option,0) { dialogInterface,i ->
                Toast.makeText(this,"You clicked on ${option[i]}",Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "accepted single choice", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("NO") { _, _ ->
                Toast.makeText(this, "declined single choice", Toast.LENGTH_SHORT)
                    .show()
            }.create()

        binding.btnDialog2.setOnClickListener(){
            singleChoiceDialog.show()
        }
        val multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose Multiple")
            .setMultiChoiceItems(option, booleanArrayOf(false,false,false)){_,i,isChecked ->
                if(isChecked) {
                    Toast.makeText(this, "you checked ${option[i]}", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this,"you unchecked ${option[i]}",Toast.LENGTH_SHORT).show()
                }
            }

            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "accepted single choice", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("NO") { _, _ ->
                Toast.makeText(this, "declined single choice", Toast.LENGTH_SHORT)
                    .show()
            }.create()
        binding.btnDialog3.setOnClickListener(){
            multiChoiceDialog.show()
        }
    }
}