package com.catatancodingku.kotlinrv

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_rv.view.*

class LangProgramAdapter(
    val context : Context,
    val titleRow : Array<String>,
    val subtitleRow : Array<String>,
    val imageRow : IntArray
) : RecyclerView.Adapter<LangProgramAdapter.ViewHolderLangProgram>() {



    class ViewHolderLangProgram(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvTitle     = itemView.item_rvmain_title
        val tvSubtitle  = itemView.tv_rvmain_rate
        val ivLanguage  = itemView.item_rvmain_image
        val ivLike      = itemView.iv_love
        val ivLiked     = itemView.iv_loved

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderLangProgram {

        val view = LayoutInflater.from(context).inflate(R.layout.list_rv,parent,false)
        return ViewHolderLangProgram(view)
    }

    override fun getItemCount() = titleRow.size

    override fun onBindViewHolder(holder: ViewHolderLangProgram, position: Int) {

        holder.tvTitle.text         = titleRow[position]
        holder.tvSubtitle.text      = subtitleRow[position]
        holder.ivLanguage.setImageResource(imageRow[position])
        
        holder.ivLike.setOnClickListener {
            Toast.makeText(context, "You liked ${titleRow[position]}", Toast.LENGTH_SHORT).show()

            holder.ivLiked.visibility    = View.VISIBLE
            holder.ivLike.visibility     = View.INVISIBLE

        }

        holder.ivLiked.setOnClickListener {
            Toast.makeText(context, "You disliked ${titleRow[position]}", Toast.LENGTH_SHORT).show()

            holder.ivLiked.visibility    = View.INVISIBLE
            holder.ivLike.visibility     = View.VISIBLE

        }

        holder.itemView.setOnClickListener {
            val move    = Intent(context,DetailAct::class.java)
            move.putExtra("TITLE", titleRow[position])
            move.putExtra("IMAGE", imageRow[position])
            move.putExtra("SUBTITLE", subtitleRow[position])
            context.startActivity(move)
        }

    }
}