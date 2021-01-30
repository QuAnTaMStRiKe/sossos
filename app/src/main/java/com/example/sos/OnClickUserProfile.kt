package com.example.sos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_message.*
import kotlinx.android.synthetic.main.activity_on_click_user_profile.*
import java.lang.NullPointerException
import java.sql.Types.NULL

class OnClickUserProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_click_user_profile)
        backBtn1.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        eContacts.setOnClickListener {
            val i = Intent(this,OnClickEmerContacts::class.java)
            startActivity(i)
        }
if(editText5 == null){
    eMsg.setOnClickListener {
        val i = Intent(this, OnClickEmerMsg::class.java)
        startActivity(i)
    }
}else if(editText5 != null){eMsg.setOnClickListener {
    val i = Intent(this, Message::class.java)
    startActivity(i)
}

}
        homeBtn1.setOnClickListener {
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
    }
}



