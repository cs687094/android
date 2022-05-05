package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.Toast

class CheckboxActivity : AppCompatActivity() {

    private lateinit var mCb5: CheckBox
    private lateinit var mCb6: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox)

        mCb5 = findViewById(R.id.cb_5)
        mCb6 = findViewById(R.id.cb_6)

        mCb5.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(this, if (isChecked) "5选中" else "5未选中", Toast.LENGTH_SHORT).show()
        }

        mCb6.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(this, if (isChecked) "6选中" else "6未选中", Toast.LENGTH_SHORT).show()
        }

    }
}