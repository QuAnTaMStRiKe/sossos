package com.example.sos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_on_click_emer_msg.*

class OnClickEmerMsg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_click_emer_msg)
        backBtn1.setOnClickListener {
            val i = Intent(this, OnClickUserProfile::class.java)
            startActivity(i)

        }
    }
}