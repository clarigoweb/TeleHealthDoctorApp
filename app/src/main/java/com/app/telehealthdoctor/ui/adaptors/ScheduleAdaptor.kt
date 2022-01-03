package com.app.telehealthdoctor.ui.adaptors

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.telehealthdoctor.R
import kotlinx.android.synthetic.main.schedule_item.view.*

class ScheduleAdaptor : RecyclerView.Adapter<ScheduleAdaptor.SchView>() {

    class SchView(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv_id = itemView.tv_id
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchView {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.schedule_item, parent, false)
        return SchView(view)
    }

    override fun onBindViewHolder(holder: SchView, position: Int) {
        holder.tv_id.underline()
    }

    override fun getItemCount(): Int {
        return 3
    }

    fun TextView.underline() {
        paintFlags = paintFlags or Paint.UNDERLINE_TEXT_FLAG
    }
}