package com.app.telehealthdoctor.ui

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.app.telehealthdoctor.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        findViewById<TextView>(R.id.tv_sign_up).setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
        findViewById<TextView>(R.id.tv_signUpWithOtp).setOnClickListener {
            val intent = Intent(this, SignUpWithOtp::class.java)
            startActivity(intent)
        }

    }
}