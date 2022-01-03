package com.app.telehealthdoctor.ui.adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.telehealthdoctor.R

class FeedsAdaptor : RecyclerView.Adapter<FeedsAdaptor.FeedsView>() {
    class FeedsView(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedsView {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.feeds_item, parent, false)
        return FeedsView(view)
    }

    override fun onBindViewHolder(holder: FeedsView, position: Int) {

    }

    override fun getItemCount(): Int {
        return 3
    }
}