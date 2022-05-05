package com.example.myfirstapp.recylerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myfirstapp.R

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var mBtnLinear: Button
    private lateinit var mBtnHor: Button
    private lateinit var mBtnGrid: Button
    private lateinit var mBtnPu: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        mBtnLinear = findViewById(R.id.btn_linear)
        mBtnLinear.setOnClickListener {
            val intent = Intent(this, LinearRecyclerViewActivity::class.java)
            startActivity(intent)
        }

        mBtnHor = findViewById(R.id.btn_hor)
        mBtnHor.setOnClickListener {
            val intent = Intent(this, HorRecyclerViewActivity::class.java)
            startActivity(intent)
        }

        mBtnGrid = findViewById(R.id.btn_grid)
        mBtnGrid.setOnClickListener {
            val intent = Intent(this, GridRecyclerViewActivity::class.java)
            startActivity(intent)
        }

        mBtnPu = findViewById(R.id.btn_pu)
        mBtnPu.setOnClickListener {
            val intent = Intent(this, PuRecyclerActivity::class.java)
            startActivity(intent)
        }
    }
}