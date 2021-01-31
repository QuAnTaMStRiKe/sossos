package com.example.sos

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_on_click_emer_contacts.*
import kotlinx.android.synthetic.main.activity_on_click_emer_msg.*
import kotlinx.android.synthetic.main.activity_on_click_emer_msg.backBtn1
import kotlinx.android.synthetic.main.activity_on_click_emer_msg.editText

class OnClickEmerMsg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_click_emer_msg)
        saveBtn2.setOnClickListener {
            val message:String = editText.text.toString()
            val sharedPreferences: SharedPreferences = this.getSharedPreferences("myKey", Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("Message", message)
            editor.apply()
            val i = Intent(this, Message::class.java)
            startActivity(i)
        }
        backBtn1.setOnClickListener {
            val i = Intent(this, OnClickUserProfile::class.java)
            startActivity(i)
        }
    }
}