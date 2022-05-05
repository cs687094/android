package com.example.myfirstapp.listview

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

class MyListAdapter(context: Context) : BaseAdapter() {

    private var mContext: Context = context
    private var mLayoutInflater: LayoutInflater = LayoutInflater.from(context)

    class ViewHolder {
        lateinit var imageView: ImageView
        lateinit var tvTitle: TextView
        lateinit var tvTime: TextView
        lateinit var tvContent: TextView
    }

    @SuppressLint("SetTextI18n", "InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val holder: ViewHolder
        val v: View
        if (convertView == null) {
            v = mLayoutInflater.inflate(R.layout.layout_list_item, null)
            holder = ViewHolder()
            holder.imageView = v.findViewById(R.id.iv)
            holder.tvTitle = v.findViewById(R.id.tv_title)
            holder.tvTime = v.findViewById(R.id.tv_time)
            holder.tvContent = v.findViewById(R.id.tv_content)
            v.tag = holder
        } else {
            v = convertView
            holder = convertView.tag as ViewHolder
        }
        holder.tvTitle.text = "这是标题"
        holder.tvTime.text = "2020-08-08"
        holder.tvContent.text = "这是内容"
        Glide.with(mContext).load("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2692153316,2549394760&fm=26&gp=0.jpg")
            .into(holder.imageView)
        return v
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int { // 列表长度
        return 10
    }

}