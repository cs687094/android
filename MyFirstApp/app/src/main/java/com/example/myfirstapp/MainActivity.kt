package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.myfirstapp.gridview.GridViewActivity
import com.example.myfirstapp.listview.ListViewActivity
import com.example.myfirstapp.recylerview.RecyclerViewActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mBtnTextView: Button
    private lateinit var mBtnButton: Button
    private lateinit var mBtnEditText: Button
    private lateinit var mBtnRadioBtn: Button
    private lateinit var mBtnCheckBox: Button
    private lateinit var mBtnImageView: Button
    private lateinit var mBtnListView: Button
    private lateinit var mBtnGridView: Button
    private lateinit var mBtnRecyclerView: Button
    private lateinit var mBtnWebView: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBtnTextView = findViewById(R.id.btn_textview)
        mBtnButton = findViewById(R.id.btn_button)
        mBtnEditText = findViewById(R.id.btn_edittext)
        mBtnRadioBtn = findViewById(R.id.btn_radiobutton)
        mBtnCheckBox = findViewById(R.id.btn_checkbox)
        mBtnImageView = findViewById(R.id.btn_imageview)
        mBtnListView = findViewById(R.id.btn_listview)
        mBtnGridView = findViewById(R.id.btn_gridview)
        mBtnRecyclerView = findViewById(R.id.btn_recyclerview)
        mBtnWebView = findViewById(R.id.btn_webview)
        setListeners()
    }

    private fun setListeners() {
        val onclick = Onclick()
        mBtnTextView.setOnClickListener(onclick)
        mBtnButton.setOnClickListener(onclick)
        mBtnEditText.setOnClickListener(onclick)
        mBtnRadioBtn.setOnClickListener(onclick)
        mBtnCheckBox.setOnClickListener(onclick)
        mBtnImageView.setOnClickListener(onclick)
        mBtnListView.setOnClickListener(onclick)
        mBtnGridView.setOnClickListener(onclick)
        mBtnRecyclerView.setOnClickListener(onclick)
        mBtnWebView.setOnClickListener(onclick)
    }

    inner class Onclick : View.OnClickListener {
        override fun onClick(v: View?) {
            var intent = Intent()
            when (v?.id) {
                R.id.btn_edittext -> intent = Intent(this@MainActivity, TextViewActivity::class.java)
                R.id.btn_button -> intent = Intent(this@MainActivity, ButtonActivity::class.java)
                R.id.btn_radiobutton -> intent = Intent(this@MainActivity, RadioButtonActivity::class.java)
                R.id.btn_textview -> intent = Intent(this@MainActivity, EditTextActivity::class.java)
                R.id.btn_checkbox -> intent = Intent(this@MainActivity, CheckboxActivity::class.java)
                R.id.btn_imageview -> intent = Intent(this@MainActivity, ImageViewActivity::class.java)
                R.id.btn_listview -> intent = Intent(this@MainActivity, ListViewActivity::class.java)
                R.id.btn_gridview -> intent = Intent(this@MainActivity, GridViewActivity::class.java)
                R.id.btn_recyclerview -> intent = Intent(this@MainActivity, RecyclerViewActivity::class.java)
                R.id.btn_webview -> intent = Intent(this@MainActivity, WebviewActivity::class.java)
                else -> {
                }
            }
            startActivity(intent)
        }
    }


}