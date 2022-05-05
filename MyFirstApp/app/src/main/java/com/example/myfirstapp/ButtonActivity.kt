package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ButtonActivity : AppCompatActivity() {

    private lateinit var mBtn3: Button

    lateinit var mTv1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)
        mBtn3 = findViewById(R.id.btn_3)
        mBtn3.setOnClickListener {
            Toast.makeText(this, "btn3被点击了", Toast.LENGTH_SHORT).show() // 通常写法
        }

        mTv1 = findViewById(R.id.tv_1)
        mTv1.setOnClickListener {
            Toast.makeText(this, "tv1被点击了", Toast.LENGTH_SHORT).show()
        }
    }

    fun showToast(view: View) {
        Toast.makeText(this, "btn4被点击了", Toast.LENGTH_SHORT).show()
    }


}