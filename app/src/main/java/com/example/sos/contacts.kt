package com.example.sos

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_contacts.*

class contacts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        val sharedPref: SharedPreferences = this.getSharedPreferences(
            "myKey",
            Context.MODE_PRIVATE
        )
        val name: String? = sharedPref.getString("Name", "")
        val number: String? = sharedPref.getString("Number", "")
        editText3.text = name.toString()
        editText4.text = number.toString()
        editData.setOnClickListener {
            val i = Intent(this, OnClickEmerContacts::class.java)
            startActivity(i)
        }
        backBtnContacts.setOnClickListener {
            val i = Intent(this, OnClickUserProfile::class.java)
            startActivity(i)
        }
    }
}