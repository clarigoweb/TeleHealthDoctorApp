package com.app.telehealthdoctor.ui.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.app.telehealthdoctor.R
import kotlinx.android.synthetic.main.activity_appointment_details.*

class AppointmentDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appointment_details)

        btn_patient_history.setOnClickListener {
            if (patient_history_view.visibility == View.VISIBLE) {
                patient_history_view.visibility = View.GONE
                iv_arrow.rotation = 90f
            } else {
                iv_arrow.rotation = -90f
                patient_history_view.visibility = View.VISIBLE
            }
        }
    }
}