package com.app.telehealthdoctor.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.telehealthdoctor.R
import kotlinx.android.synthetic.main.activity_add_feed.*

class AddFeedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_feed)

        tv_postFeed.setOnClickListener { onBackPressed() }
        iv_close.setOnClickListener { onBackPressed() }
    }
}