package com.app.telehealthdoctor.ui.adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.telehealthdoctor.R

class AvailabilityAdaptor : RecyclerView.Adapter<AvailabilityAdaptor.AvailableView>() {

    class AvailableView(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AvailableView {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.availability_item, parent, false)
        return AvailableView(view)
    }

    override fun onBindViewHolder(holder: AvailableView, position: Int) {
    }

    override fun getItemCount(): Int {
        return 5
    }
}