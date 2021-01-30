package com.example.sos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_message.*

class Message : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
val message = intent.getStringExtra("Message")
        editText5.text = message.toString()
        backBtnMessage.setOnClickListener {
            val i = Intent(this,OnClickUserProfile::class.java)
            startActivity(i)
        }
        editData.setOnClickListener {
            val i = Intent(this,OnClickEmerMsg::class.java)
            startActivity(i)
        }
    }
}