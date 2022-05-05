package com.example.myfirstapp.gridview

import android.os.Bundle
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.R

class GridViewActivity : AppCompatActivity() {

    private lateinit var mGv: GridView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gridview)
        mGv = findViewById(R.id.gv)
        mGv.adapter = MyGridAdapter(this)
        mGv.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "点击 pos:$position", Toast.LENGTH_SHORT).show()
        }
        mGv.setOnItemLongClickListener { parent, view, position, id ->
            Toast.makeText(this, "长按 pos:$position", Toast.LENGTH_SHORT).show()
            true
        }
    }
}