package com.example.android_studio_practices

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast.LENGTH_SHORT
import android.widget.Toast.makeText
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.ActivityToolbarMenusBinding

class Toolbar_Menus : AppCompatActivity() {

    private lateinit var binding: ActivityToolbarMenusBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToolbarMenusBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.toolbarmenu,menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.miAddContact -> Toast.makeText(this,"You clickr on Add Contact",Toast.LENGTH_SHORT).show()
            R.id.miFeedback -> Toast.makeText(this,"You clickr on Add Feedback",Toast.LENGTH_SHORT).show()
            R.id.miCloseApp -> Toast.makeText(this,"You clickr on Add CloseApp",Toast.LENGTH_SHORT).show()
            R.id.miSettings -> Toast.makeText(this,"You clickr on Add Settings",Toast.LENGTH_SHORT).show()
            R.id.miNotifications -> Toast.makeText(this,"You clickr on Add Notifications",Toast.LENGTH_SHORT).show()
        }

        return true
    }
}