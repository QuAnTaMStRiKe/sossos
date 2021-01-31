package com.example.sos

import android.Manifest
import android.app.PendingIntent
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.telephony.SmsManager
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setupPermissions()
        sosBtn.setOnClickListener{

           // val pi = PendingIntent.getActivity(applicationContext, 0, intent, 0)
          //  val sms: SmsManager = SmsManager.getDefault()
           // sms.sendTextMessage("8588842361", null, "help", pi, null)

            Toast.makeText(it.context, "Fuck off ", Toast.LENGTH_LONG).show()


        }
        UserBtn.setOnClickListener {
            val i = Intent(this, OnClickUserProfile::class.java)
            startActivity(i)
        }

        }

    }
