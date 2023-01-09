package com.example.android_studio_practices

import android.os.Bundle
import android.view.MenuItem

import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.ActivitySlidableMenuBinding

class SlidableMenu : AppCompatActivity() {
    private lateinit var binding: ActivitySlidableMenuBinding
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySlidableMenuBinding.inflate(layoutInflater)
        toggle = ActionBarDrawerToggle(this,binding.drawerLayout,R.string.open,R.string.close)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayShowHomeEnabled(true)

        binding.navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miItem1 -> Toast.makeText(applicationContext,"Clicked Item 1",Toast.LENGTH_SHORT).show()
                R.id.miItem2 -> Toast.makeText(applicationContext,"Clicked Item 2",Toast.LENGTH_SHORT).show()
                R.id.miItem3 -> Toast.makeText(applicationContext,"Clicked Item 3",Toast.LENGTH_SHORT).show()

            }
            true

        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}