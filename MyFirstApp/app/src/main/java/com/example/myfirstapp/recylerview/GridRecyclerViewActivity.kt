package com.example.myfirstapp.recylerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstapp.R

class GridRecyclerViewActivity : AppCompatActivity() {

    private lateinit var mRvGrid: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_recycler_view)
        mRvGrid = findViewById(R.id.rv_grid)
        mRvGrid.layoutManager = GridLayoutManager(this, 3)
        mRvGrid.adapter = GridAdapter(this)
    }
}