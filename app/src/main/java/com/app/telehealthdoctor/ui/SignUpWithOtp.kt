package com.app.telehealthdoctor.ui

import `in`.aabhasjindal.otptextview.OTPListener
import `in`.aabhasjindal.otptextview.OtpTextView
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.app.telehealthdoctor.R

class SignUpWithOtp : AppCompatActivity() {
    private var otpTextView: OtpTextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_with_otp)
        otpTextView = findViewById<OtpTextView>(R.id.otp_view)
        otpTextView?.requestFocusOTP()
        otpTextView?.otpListener = object : OTPListener {
            override fun onInteractionListener() {
            }

            override fun onOTPComplete(otp: String) {
                Log.e("Otp", "Otp $otp")
                Toast.makeText(this@SignUpWithOtp, "The OTP is $otp", Toast.LENGTH_SHORT).show()
            }
        }

    }
}