package com.example.myfirstapp.recylerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstapp.R

class GridAdapter(context: Context) : RecyclerView.Adapter<GridAdapter.GridViewHolder>() {

    private var mContext: Context = context
    private var mLayoutInflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        return GridViewHolder(mLayoutInflater.inflate(R.layout.layout_grid_recyclerview_item, parent, false))
    }

    override fun getItemCount(): Int {
        return 80
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        holder.textView.text = "Hello"
        holder.itemView.setOnClickListener {
            Toast.makeText(mContext, "click...$position", Toast.LENGTH_SHORT).show()
        }
    }

    class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView = itemView.findViewById(R.id.tv_title)
    }
}

