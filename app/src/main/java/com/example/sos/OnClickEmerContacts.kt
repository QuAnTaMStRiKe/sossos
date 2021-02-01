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
           val name_1:String = editText.text.toString()
            val number_1:String = editText2.text.toString()
            val name_2:String = editTextTextPersonName.text.toString()
            val number_2:String = editTextTextPersonName2.text.toString()
            val name_3:String = editTextTextPersonName3.text.toString()
            val number_3:String = editTextTextPersonName4.text.toString()
            val sharedPreferences: SharedPreferences = this.getSharedPreferences("myKey",Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            val i = Intent(this,contacts::class.java)
            editor.putString("Name_1", name_1)
            editor.putString("Number_1", number_1)
            editor.putString("Name_2", name_2)
            editor.putString("Number_2", number_2)
            editor.putString("Name_3", name_3)
            editor.putString("Number_3", number_3)
            editor.apply()
            startActivity(i)
        }
    }
}