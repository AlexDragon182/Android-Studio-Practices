package com.example.android_studio_practices

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView



class ViewPAgerAdapter(
    val images: List<Int>

) : RecyclerView.Adapter<ViewPAgerAdapter.ViewPagerViewholder>() {

   inner class ViewPagerViewholder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemviewpager,parent,false)
        return ViewPagerViewholder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerViewholder, position: Int) {
        val curImage = images[position]
     //   holder.itemView.ivImage.setImageResource[curImage]
    }


    override fun getItemCount(): Int {
        return images.size
    }
}
