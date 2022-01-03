package com.app.telehealthdoctor.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.telehealthdoctor.R
import com.app.telehealthdoctor.ui.adaptors.ReviewRatingAdaptor
import kotlinx.android.synthetic.main.activity_review_and_rating.*

class ReviewAndRatingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review_and_rating)
        setUpRatingReviewAdaptor()
    }

    private fun setUpRatingReviewAdaptor() {
        rv_ratingReviews.layoutManager = LinearLayoutManager(this)
        rv_ratingReviews.adapter = ReviewRatingAdaptor()
    }
}