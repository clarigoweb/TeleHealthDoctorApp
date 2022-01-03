package com.app.telehealthdoctor.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.telehealthdoctor.R
import com.app.telehealthdoctor.ui.adaptors.FeeManagementAdaptor
import kotlinx.android.synthetic.main.activity_fee_management.*

class FeeManagementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fee_management)
        setUpFeeManagementAdaptor()
    }

    private fun setUpFeeManagementAdaptor() {
        rv_feeManagement.layoutManager = LinearLayoutManager(this)
        rv_feeManagement.adapter = FeeManagementAdaptor()
    }
}