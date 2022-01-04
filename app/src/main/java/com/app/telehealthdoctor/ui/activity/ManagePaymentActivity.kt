package com.app.telehealthdoctor.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.telehealthdoctor.R
import com.app.telehealthdoctor.ui.adaptors.PaymentsAdaptor
import kotlinx.android.synthetic.main.activity_manage_payment.*

class ManagePaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manage_payment)
        iv_addBank.setOnClickListener {
            startActivity(Intent(this, AddBankActivity::class.java))
        }
        setUpPaymentsAdaptor()
    }

    private fun setUpPaymentsAdaptor() {
        rv_payments.layoutManager = LinearLayoutManager(this)
        rv_payments.adapter = PaymentsAdaptor()
    }
}