package com.example.myfirstapp.recylerview

import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstapp.R

class HorRecyclerViewActivity : AppCompatActivity() {

    private lateinit var mRvHor: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hor_recycler_view)

        mRvHor = findViewById(R.id.rv_hor)
        val horLayoutManager = LinearLayoutManager(this)
        horLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        mRvHor.addItemDecoration(MyDecoration())
        mRvHor.layoutManager = horLayoutManager
        mRvHor.adapter = HorAdapter(this)
    }

    class MyDecoration : RecyclerView.ItemDecoration() {
        override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
            super.getItemOffsets(outRect, view, parent, state)
            outRect.set(0, 0, view.resources.getDimensionPixelOffset(R.dimen.divideHeight), 0)
        }
    }
}