package com.app.telehealthdoctor.ui.adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.telehealthdoctor.R

class AvailabilityDaysAdaptor : RecyclerView.Adapter<AvailabilityDaysAdaptor.AvlbleDaysView>() {

    class AvlbleDaysView(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AvlbleDaysView {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.days_item, parent, false)
        return AvlbleDaysView(view)
    }

    override fun onBindViewHolder(holder: AvlbleDaysView, position: Int) {
    }

    override fun getItemCount(): Int {
        return 7
    }
}