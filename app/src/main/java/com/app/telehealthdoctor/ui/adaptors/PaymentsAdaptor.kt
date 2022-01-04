package com.app.telehealthdoctor.ui.adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.telehealthdoctor.R

class PaymentsAdaptor : RecyclerView.Adapter<PaymentsAdaptor.PaymentView>() {

    class PaymentView(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentView {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.payment_item, parent, false)
        return PaymentView(view)
    }

    override fun onBindViewHolder(holder: PaymentView, position: Int) {

    }

    override fun getItemCount(): Int {
        return 1
    }
}