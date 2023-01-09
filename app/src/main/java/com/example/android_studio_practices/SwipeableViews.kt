package com.example.android_studio_practices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.android_studio_practices.databinding.ActivitySwipeableViewsBinding

class SwipeableViews : AppCompatActivity() {

    private lateinit var binding: ActivitySwipeableViewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySwipeableViewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val images = listOf(
            R.drawable.squirtle,
            R.drawable.pikachu,

        )

        val adapter = ViewPAgerAdapter(images)
        binding.vpViewPAger.adapter = adapter
        binding.vpViewPAger.orientation = ViewPager2.ORIENTATION_VERTICAL
        binding.vpViewPAger.beginFakeDrag()
        binding.vpViewPAger.fakeDragBy(-10f)
        binding.vpViewPAger.endFakeDrag()

//  TabLayoutMediator(binding.tlTable,binding.vpViewPAger){ tab, position ->
     //       tab.text = "Tab ${position +1}"

     //   }.attach()
//
  //      binding.tlTable.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener){
    //        override fun onTabReselected(tab: tlTable.Tab?){
      //          Toast.makeText(this@SwipeableViews,"Selected3 ${tab?.text}"),Toast.LENGTH_SHORT).show()
        //    }
          //  override fun onTabUnselected(tab: tlTable.Tab?){
           //     Toast.makeText(this@SwipeableViews,"Selected2 ${tab?.text}"),Toast.LENGTH_SHORT).show()
//            }
  //          override fun onTabSelected(tab: tlTable.Tab?){
    //            Toast.makeText(this@SwipeableViews,"Selected ${tab?.text}"),Toast.LENGTH_SHORT).show()
      //      }
        }
    }




