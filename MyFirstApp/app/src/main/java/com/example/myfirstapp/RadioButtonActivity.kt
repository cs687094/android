package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class RadioButtonActivity : AppCompatActivity() {

    private lateinit var mRg1: RadioGroup


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)

        mRg1 = findViewById(R.id.rg_1)
        mRg1.setOnCheckedChangeListener { group, checkedId ->
            val radioButton = group.findViewById<RadioButton>(checkedId)
            Toast.makeText(this, radioButton.text, Toast.LENGTH_SHORT).show()
        }

    }
}
