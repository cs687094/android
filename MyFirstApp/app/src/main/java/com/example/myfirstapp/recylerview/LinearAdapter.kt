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

class LinearAdapter(context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var mContext: Context = context
    private var mLayoutInflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == 0) LinearViewHolder(mLayoutInflater.inflate(R.layout.layout_linear_item, parent, false))
        else LinearViewHolder2(mLayoutInflater.inflate(R.layout.layout_linear_item_2, parent, false))
    }

    override fun getItemCount(): Int {
        return 30
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (getItemViewType(position) == 0) {
            val holder1 = holder as LinearViewHolder
            holder.textView.text = "Hello World"
        } else {
            val holder2 = holder as LinearViewHolder2
            holder2.textView.text = "Hello World2"
        }
        holder.itemView.setOnClickListener {
            Toast.makeText(mContext, "click...$position", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemViewType(position: Int) = if (position % 2 == 0) 0 else 1

    class LinearViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView = itemView.findViewById(R.id.tv_title)
    }

    class LinearViewHolder2(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView = itemView.findViewById(R.id.tv_title)
        var imageView: ImageView = itemView.findViewById(R.id.iv_image)
    }
}

