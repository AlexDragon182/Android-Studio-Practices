package com.example.android_studio_practices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_studio_practices.databinding.ActivityReciclerViewBinding

class ReciclerView : AppCompatActivity() {

    private lateinit var binding: ActivityReciclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReciclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var todoList = mutableListOf(
            ToDo("Hi",false),
            ToDo("Hello",false),
            ToDo("Hola",false),
            ToDo("irasaibaise",false),
            ToDo("bonjour",false)
        )

        val adapter = ItemAllAdapter(todoList)
        binding.rvAll.adapter = adapter
        binding.rvAll.layoutManager = LinearLayoutManager(this)

        binding.btnAll.setOnClickListener{
            val title = binding.etAll.text.toString()
            val todo = ToDo(title,false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size-1)
        }

    }
}