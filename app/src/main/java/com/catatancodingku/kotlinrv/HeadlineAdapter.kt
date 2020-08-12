package com.catatancodingku.kotlinrv

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_rvtop.view.*

class HeadlineAdapter(
    val context: Context,
    val imageHeader : IntArray,
    val titleHeader : Array<String>
): RecyclerView.Adapter<MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_rvtop,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = titleHeader.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.ivHeader.setImageResource(imageHeader[position])
        holder.tvHeader.text    = titleHeader[position]
    }
}

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val ivHeader    = itemView.item_rvTop_image
    val tvHeader    = itemView.item_rvTop_title
}
