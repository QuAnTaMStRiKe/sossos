package com.example.sos

import android.Manifest
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationManager
import android.net.Uri
import android.os.Bundle
import android.telephony.SmsManager
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private val TAG = "SMSPermission"
    private val SEND_SMS_CODE = 101
    private val TAG2 = "SMSPermission"
    private val SEND_LOCATION_CODE = 102

    private fun setupPermissions() {
        val permission = ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.SEND_SMS
        )

        if (permission != PackageManager.PERMISSION_GRANTED) {
            Log.i(TAG, "Permission to send sms denied")
            makeRequest()
        }
    }
    private fun setupLocationPermissions() {
        val permission = ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
        )

        if (permission != PackageManager.PERMISSION_GRANTED) {
            Log.i(TAG2, "Permission to send Location denied")
            makeLocationRequest()
        }
    }

    private fun makeRequest() {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.SEND_SMS),
                SEND_SMS_CODE
        )
    }
    private fun makeLocationRequest() {
        ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                SEND_LOCATION_CODE
        )
    }
    override fun onRequestPermissionsResult(
            requestCode: Int,
            permissions: Array<String>,
            grantResults: IntArray
    ) {
        when (requestCode) {
            SEND_SMS_CODE -> {

                if (grantResults.isEmpty() || grantResults[0] != PackageManager.PERMISSION_GRANTED) {

                    Log.i(TAG, "Permission has been denied by user")
                } else {
                    Log.i(TAG, "Permission has been granted by user")
                }
            }
            SEND_LOCATION_CODE -> {
                if (grantResults.isEmpty() || grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                    Log.i(TAG2, "Permission has been denied by user")
                } else {
                    Log.i(TAG2, "Permission has been granted by user")
                }
            }
        } }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sharedPref: SharedPreferences = this.getSharedPreferences(
                "myKey",
                Context.MODE_PRIVATE
        )
        setupPermissions()
        setupLocationPermissions()
    sosBtn.setOnClickListener {
        val g = GPStracker(applicationContext)
        val l: Location = g.getLocation()
       if(l != null){
           val lat = l.latitude
           val lon = l.longitude
           val location_message = "http://maps.google.com/maps?q=$lat,$lon"
           val number_1: String? = sharedPref.getString("Number_1", "")
           val number_2: String? = sharedPref.getString("Number_2", "")
           val number_3: String? = sharedPref.getString("Number_3", "")
           val smsManager = SmsManager.getDefault()
           val smsBody = StringBuffer()
           smsBody.append(Uri.parse(location_message));
           SmsManager.getDefault().sendTextMessage(number_1, null, smsBody.toString(), null, null);
           SmsManager.getDefault().sendTextMessage(number_2, null, smsBody.toString(), null, null);
           SmsManager.getDefault().sendTextMessage(number_3, null, smsBody.toString(), null, null);
       }
        val pi = PendingIntent.getActivity(applicationContext, 0, intent, 0)
           val sms: SmsManager = SmsManager.getDefault()

        val number_1: String? = sharedPref.getString("Number_1", "")
        val number_2: String? = sharedPref.getString("Number_2", "")
        val number_3: String? = sharedPref.getString("Number_3", "")
        val message: String? = sharedPref.getString("Message", "")
       sms.sendTextMessage(number_1, null, message, pi, null)
        sms.sendTextMessage(number_2, null, message, pi, null)
        sms.sendTextMessage(number_3, null, message, pi, null)

        Toast.makeText(it.context, "Emergency Message Sent", Toast.LENGTH_LONG).show()

    }
        UserBtn.setOnClickListener {
            val i = Intent(this, OnClickUserProfile::class.java)
            startActivity(i)
        }

        }

    }
