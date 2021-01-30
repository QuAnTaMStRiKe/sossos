package com.example.sos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contacts.*

class contacts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        val name = intent.getStringExtra("Name")
        val number = intent.getStringExtra("Number")
        editText3.text = name.toString()
        editText4.text = number.toString()
        editData.setOnClickListener {
            val i = Intent(this, OnClickEmerContacts::class.java)
            startActivity(i)
        }
        backBtnContacts.setOnClickListener {
            val i = Intent(this,OnClickUserProfile::class.java)
            startActivity(i)
        }
    }
}