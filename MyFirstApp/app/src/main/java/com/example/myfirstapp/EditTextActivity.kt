package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener

class EditTextActivity : AppCompatActivity() {

    private lateinit var mBtnLogin: Button
    private lateinit var mEtUsername: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)
        mBtnLogin = findViewById(R.id.btn_login)
        mBtnLogin.setOnClickListener {
            Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show()
        }

        mEtUsername = findViewById(R.id.et_1)
        mEtUsername.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("edittext", s.toString())
            }

            override fun afterTextChanged(s: Editable?) {
            }
        })

    }


}