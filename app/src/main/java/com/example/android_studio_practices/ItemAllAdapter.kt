package com.example.android_studio_practices

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_studio_practices.databinding.ItemAllBinding

class ItemAllAdapter(
    var All : List<ToDo>

) :RecyclerView.Adapter<ItemAllAdapter.TodoViewHolder>(){

    private lateinit var binding: ItemAllBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_all,parent,false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {

        holder.itemView.apply {
            binding.tvTitle.text = All[position].title
            binding.cbDone.isChecked = All[position].isChecked
        }
    }

    override fun getItemCount(): Int {
        return All.size
    }

    inner class  TodoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}