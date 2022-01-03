package com.app.telehealthdoctor.ui.adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.telehealthdoctor.R

class ReviewRatingAdaptor : RecyclerView.Adapter<ReviewRatingAdaptor.ReviewView>() {
    class ReviewView(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewView {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.review_rating_item, parent, false)
        return ReviewView(view)
    }

    override fun onBindViewHolder(holder: ReviewView, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}