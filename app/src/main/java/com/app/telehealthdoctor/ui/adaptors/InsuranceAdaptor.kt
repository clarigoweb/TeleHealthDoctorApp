package com.app.telehealthdoctor.ui.adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.telehealthdoctor.R

class InsuranceAdaptor : RecyclerView.Adapter<InsuranceAdaptor.InsuView>() {
    class InsuView(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InsuView {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.insurance_item, parent, false)
        return InsuView(view)

    }

    override fun onBindViewHolder(holder: InsuView, position: Int) {
    }

    override fun getItemCount(): Int {
        return 3
    }
}