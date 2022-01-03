package com.app.telehealthdoctor.ui.adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.telehealthdoctor.R

class FeeManagementAdaptor : RecyclerView.Adapter<FeeManagementAdaptor.FeeView>() {

    class FeeView(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeeView {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.fee_management_item, parent, false);
        return FeeView(view)
    }

    override fun onBindViewHolder(holder: FeeView, position: Int) {

    }

    override fun getItemCount(): Int {
        return 4
    }
}