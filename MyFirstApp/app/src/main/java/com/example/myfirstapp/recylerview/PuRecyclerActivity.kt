package com.example.myfirstapp.recylerview

import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.myfirstapp.R

class PuRecyclerActivity : AppCompatActivity() {

    private lateinit var mRvPu: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pu_recycler)

        mRvPu = findViewById(R.id.rv_pu)
        mRvPu.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        mRvPu.addItemDecoration(MyDecoration())
        mRvPu.adapter = StaggeredGridAdapter(this)
    }

    class MyDecoration : RecyclerView.ItemDecoration() {
        override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
            super.getItemOffsets(outRect, view, parent, state)
            val gap = view.resources.getDimensionPixelOffset(R.dimen.divideHeight2)
            outRect.set(gap, gap, gap, gap)
        }
    }
}