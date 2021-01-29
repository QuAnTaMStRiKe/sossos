package com.example.sos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sosBtn.setOnClickListener{
            val i =Intent(this, OnClickSOSbtn::class.java)
            startActivity(i)
        }
        UserBtn.setOnClickListener {
            val i = Intent(this, OnClickUserProfile::class.java)
            startActivity(i)
        }
    }
}