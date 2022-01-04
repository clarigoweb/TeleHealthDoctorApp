package com.app.telehealthdoctor.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.telehealthdoctor.R
import com.app.telehealthdoctor.ui.adaptors.FeedsAdaptor
import kotlinx.android.synthetic.main.activity_feeds_post.*

class FeedsPostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feeds_post)
        setUpFeedsAdaptor()
        add_feed.setOnClickListener {
            startActivity(Intent(this, AddFeedActivity::class.java))
        }
    }

    private fun setUpFeedsAdaptor() {
        rv_feeds.layoutManager = LinearLayoutManager(this)
        rv_feeds.adapter = FeedsAdaptor()
    }
}