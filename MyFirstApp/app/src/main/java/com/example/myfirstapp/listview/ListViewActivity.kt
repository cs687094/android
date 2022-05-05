package com.example.myfirstapp.listview

import android.app.Activity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import com.example.myfirstapp.R

class ListViewActivity : Activity() {

    private lateinit var mLv1: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        mLv1 = findViewById(R.id.lv_1)
        mLv1.adapter = MyListAdapter(this)
        mLv1.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "点击pos:$position", Toast.LENGTH_SHORT).show()
        }
        mLv1.setOnItemLongClickListener { parent, view, position, id ->
            Toast.makeText(this, "长按pos:$position", Toast.LENGTH_SHORT).show()
            true
        }
    }

}