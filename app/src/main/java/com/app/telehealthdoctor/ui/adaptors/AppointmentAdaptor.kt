package com.app.telehealthdoctor.ui.adaptors

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.telehealthdoctor.R
import com.app.telehealthdoctor.ui.activity.AppointmentDetailsActivity

class AppointmentAdaptor(private val context: Context) :
    RecyclerView.Adapter<AppointmentAdaptor.AppointmentView>() {


    class AppointmentView(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppointmentView {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.appointment_item, parent, false)
        return AppointmentView(view)
    }

    override fun onBindViewHolder(holder: AppointmentView, position: Int) {
        holder.itemView.setOnClickListener {
            context.startActivity(Intent(context, AppointmentDetailsActivity::class.java))
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
}