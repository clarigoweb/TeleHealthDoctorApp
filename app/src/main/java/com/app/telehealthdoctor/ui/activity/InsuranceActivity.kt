package com.app.telehealthdoctor.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.telehealthdoctor.R
import com.app.telehealthdoctor.ui.adaptors.InsuranceAdaptor
import kotlinx.android.synthetic.main.activity_insurancee.*

class InsuranceActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insurancee)
        iv_add.setOnClickListener(this)
        setUpInsuranceAdaptor()
    }

    private fun setUpInsuranceAdaptor() {
        rv_insurance.layoutManager = LinearLayoutManager(this)
        rv_insurance.adapter = InsuranceAdaptor()
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.iv_add -> startActivity(Intent(this, AddInsuranceActivity2::class.java))
        }
    }
}