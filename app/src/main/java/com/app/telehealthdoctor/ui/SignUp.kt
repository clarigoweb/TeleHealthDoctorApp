package com.app.telehealthdoctor.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.app.telehealthdoctor.R

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        findViewById<TextView>(R.id.tv_login).setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        })
    }
}