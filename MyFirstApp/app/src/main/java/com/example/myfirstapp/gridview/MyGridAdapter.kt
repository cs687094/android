package com.example.myfirstapp.gridview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.myfirstapp.R

class MyGridAdapter(context: Context) : BaseAdapter() {

    private var mContext: Context = context
    private var mLayoutInflater: LayoutInflater = LayoutInflater.from(context)

    class ViewHolder {
        lateinit var imageView: ImageView
        lateinit var textView: TextView
    }

    @SuppressLint("InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val holder: ViewHolder
        val v: View
        if (convertView == null) {
            v = mLayoutInflater.inflate(R.layout.layout_grid_item, null)
            holder = ViewHolder()
            holder.imageView = v.findViewById(R.id.iv_grid)
            holder.textView = v.findViewById(R.id.tv_title)
            v.tag = holder
        } else {
            v = convertView
            holder = convertView.tag as ViewHolder
        }
        holder.textView.text = "花"
        Glide.with(mContext).load("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg14.360buyimg.com%2Fn0%2Fjfs%2Ft2740%2F163%2F951722573%2F619210%2Fcd4a7b33%2F572df1b5N85de4909.png&refer=http%3A%2F%2Fimg14.360buyimg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1613206972&t=0a05fe81e0d18011e60d1282583d19ce").into(holder.imageView)
        return v
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return 10
    }

}