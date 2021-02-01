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
        val name_1: String? = sharedPref.getString("Name_1", "")
        val number_1: String? = sharedPref.getString("Number_1", "")
        val name_2: String? = sharedPref.getString("Name_2", "")
        val number_2: String? = sharedPref.getString("Number_2", "")
        val name_3: String? = sharedPref.getString("Name_3", "")
        val number_3: String? = sharedPref.getString("Number_3", "")
        name1.text = name_1.toString()
        number1.text = number_1.toString()
        name2.text = name_2.toString()
        number2.text = number_2.toString()
        name3.text = name_3.toString()
        number3.text = number_3.toString()
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