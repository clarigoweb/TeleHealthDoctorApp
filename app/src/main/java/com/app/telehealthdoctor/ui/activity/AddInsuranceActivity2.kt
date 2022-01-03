package com.app.telehealthdoctor.ui.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.app.telehealthdoctor.R
import kotlinx.android.synthetic.main.activity_insurance2.*

class AddInsuranceActivity2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insurance2)
        tv_clear.setOnClickListener(this)
        tv_add.setOnClickListener(this)
        iv_back.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.tv_clear -> onBackPressed()
            R.id.tv_add -> onBackPressed()
            R.id.iv_back -> onBackPressed()
        }
    }
}