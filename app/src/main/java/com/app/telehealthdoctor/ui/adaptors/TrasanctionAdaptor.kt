package com.app.telehealthdoctor.ui.adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.telehealthdoctor.R

class TrasanctionAdaptor : RecyclerView.Adapter<TrasanctionAdaptor.TransView>() {
    class TransView(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransView {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.transaction_item, parent, false)
        return TransView(view)
    }

    override fun onBindViewHolder(holder: TransView, position: Int) {

    }

    override fun getItemCount(): Int {
        return 3
    }
}