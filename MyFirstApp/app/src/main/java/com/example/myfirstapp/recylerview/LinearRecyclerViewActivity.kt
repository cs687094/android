package com.example.myfirstapp.recylerview

import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstapp.R

class LinearRecyclerViewActivity : AppCompatActivity() {

    private lateinit var mRvMain: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_recycler_view)

        mRvMain = findViewById(R.id.rv_main)
        mRvMain.layoutManager = LinearLayoutManager(this)
        mRvMain.addItemDecoration(MyDecoration())
        mRvMain.adapter = LinearAdapter(this)
    }

    class MyDecoration : RecyclerView.ItemDecoration() {
        override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
            super.getItemOffsets(outRect, view, parent, state)
            outRect.set(0, 0, 0, view.resources.getDimensionPixelOffset(R.dimen.divideHeight))
        }
    }
}