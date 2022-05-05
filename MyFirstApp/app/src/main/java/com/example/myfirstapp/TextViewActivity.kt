package com.example.myfirstapp

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TextViewActivity : AppCompatActivity() {

    private lateinit var mTv4: TextView

    private lateinit var mTv5: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view)
        mTv4 = findViewById(R.id.tv_4)
        mTv4.paint.flags = Paint.STRIKE_THRU_TEXT_FLAG // 中划线
        mTv4.paint.isAntiAlias = true // 去除锯齿

        mTv5 = findViewById(R.id.tv_5)
        mTv5.paint.flags = Paint.UNDERLINE_TEXT_FLAG // 下划线
    }
}