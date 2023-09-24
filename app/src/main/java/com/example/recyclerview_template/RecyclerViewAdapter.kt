package com.example.recyclerview_template

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class RecyclerViewAdapter(private val dataList: ArrayList<Natural_Images>)
    : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = dataList[position]
        holder.titleImages.setImageResource(data.titleImages)
        holder.headerTitle_tv.text = data.heading
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val titleImages :ShapeableImageView = itemView.findViewById(R.id.titleImage)
        val headerTitle_tv : TextView = itemView.findViewById(R.id.headerTitle_tv)

    }

}
