package com.example.myfirstapp.recylerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstapp.R

class StaggeredGridAdapter(context: Context) : RecyclerView.Adapter<StaggeredGridAdapter.StaggeredGridViewHolder>() {

    private var mContext: Context = context
    private var mLayoutInflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StaggeredGridViewHolder {
        return StaggeredGridViewHolder(mLayoutInflater.inflate(R.layout.layout_staggered_grid_recyclerview_item, parent, false))
    }

    override fun getItemCount(): Int {
        return 80
    }

    override fun onBindViewHolder(holder: StaggeredGridViewHolder, position: Int) {
        if (position % 2 != 0) holder.imageView.setImageResource(R.drawable.heng)
        else holder.imageView.setImageResource(R.drawable.shu)
        holder.itemView.setOnClickListener {
            Toast.makeText(mContext, "click...$position", Toast.LENGTH_SHORT).show()
        }
    }

    class StaggeredGridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView = itemView.findViewById(R.id.iv)
    }
}

