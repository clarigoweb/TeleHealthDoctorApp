package com.app.telehealthdoctor.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.app.telehealthdoctor.MainActivity
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
        findViewById<TextView>(R.id.tv_forgotPass).setOnClickListener {
            val intent = Intent(this, ForgotPassword::class.java)
            startActivity(intent)
        }
        findViewById<RelativeLayout>(R.id.btn_login).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}