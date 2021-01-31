package com.example.sos

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_on_click_emer_contacts.*

class OnClickEmerContacts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_click_emer_contacts)
        backBtn1.setOnClickListener {
            val i = Intent(this,OnClickUserProfile::class.java)
            startActivity(i)
        }
        saveBtn1.setOnClickListener{
           val name:String = editText.text.toString()
            val number:String = editText2.text.toString()
            val sharedPreferences: SharedPreferences = this.getSharedPreferences("myKey",Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            val i = Intent(this,contacts::class.java)
            editor.putString("Name", name)
            editor.putString("Number", number)
            editor.apply()
            startActivity(i)
        }
    }
}