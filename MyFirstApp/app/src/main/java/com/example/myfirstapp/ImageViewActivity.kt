package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class ImageViewActivity : AppCompatActivity() {
    private lateinit var mIv4: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)

        mIv4 = findViewById(R.id.iv_4)
        Glide.with(this).load("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2692153316,2549394760&fm=26&gp=0.jpg")
            .into(mIv4)
    }
}