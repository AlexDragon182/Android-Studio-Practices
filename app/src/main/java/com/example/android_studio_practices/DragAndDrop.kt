package com.example.android_studio_practices

import android.content.ClipData
import android.content.ClipDescription
import android.os.Bundle
import android.view.DragEvent
import android.view.DragEvent.ACTION_DRAG_STARTED
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast.makeText
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import com.example.android_studio_practices.databinding.ActivityDragAndDropBinding

class DragAndDrop : AppCompatActivity() {
    private lateinit var binding: ActivityDragAndDropBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDragAndDropBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.llTop.setOnDragListener(dragListener)
        binding.llBottom.setOnDragListener(dragListener)

        binding.dragView.setOnClickListener(){
            val clipText = "This is our ClipData text"
            val item = ClipData.Item(clipText)
            val mineTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText,mineTypes,item)

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data,dragShadowBuilder,it,0)

            it.visibility = View.INVISIBLE
            true

        }
    }

    val dragListener = View.OnDragListener { view, event ->

        while(event.action) {
            DragEvent.ACTION_DRAG_STARTED -> {
                event.clipDescription.hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)
            }
            DragEvent.ACTION_DRAG_ENTERED ->{
                view.invalidate()
                true
            }
            DragEvent.ACTION_DRAG_LOCATION -> true
            DragEvent.ACTION_DRAG_EXITED -> {
                view.invalidate()
                true
            }
            DragEvent.ACTION_DROP -> {
                val item = event.clipData.getItemAt(0)
                val dragData = item.text
                Toast.makeText(this,dragData,Toast.LENGTH_SHORT).show()

                view.invalidate()

                val v = event.localState as View
                val owner = v.parent as ViewGroup
                owner.removeView(v)
                val destination = view as LinearLayout
                destination.addView(v)
                v.visibility = View.VISIBLE
                true ^OnDragListener
            }
            DragEvent.ACTION_DRAG_ENDED ->{
                view.invalidate()
                true
            }
            else -> false
        }
    }