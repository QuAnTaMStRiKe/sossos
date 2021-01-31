package com.example.sos

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contacts.*
import kotlinx.android.synthetic.main.activity_message.*
import kotlinx.android.synthetic.main.activity_message.editData

class Message : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        val sharedPref: SharedPreferences = this.getSharedPreferences(
            "myKey",
            Context.MODE_PRIVATE
        )
        val message: String? = sharedPref.getString("Message", "")
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