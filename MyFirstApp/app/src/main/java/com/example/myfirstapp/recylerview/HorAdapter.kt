package com.example.myfirstapp.recylerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstapp.R

class HorAdapter(context: Context) : RecyclerView.Adapter<HorAdapter.HorViewHolder>() {

    private var mContext: Context = context
    private var mLayoutInflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorViewHolder {
        return HorViewHolder(mLayoutInflater.inflate(R.layout.layout_hor_item, parent, false))
    }

    override fun getItemCount(): Int {
        return 30
    }

    override fun onBindViewHolder(holder: HorViewHolder, position: Int) {
        holder.textView.text = "Hello"
        holder.itemView.setOnClickListener {
            Toast.makeText(mContext, "click...$position", Toast.LENGTH_SHORT).show()
        }
    }

    class HorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView = itemView.findViewById(R.id.tv_title)
    }
}

