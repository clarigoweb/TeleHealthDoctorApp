package com.app.telehealthdoctor.ui.adaptors

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.telehealthdoctor.R
import kotlinx.android.synthetic.main.days_item.view.*

class AvailabilityDaysAdaptor(private val dayslist: List<String>) :
    RecyclerView.Adapter<AvailabilityDaysAdaptor.AvlbleDaysView>() {

    class AvlbleDaysView(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AvlbleDaysView {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.days_item, parent, false)
        return AvlbleDaysView(view)
    }

    var posi = 0
    override fun onBindViewHolder(holder: AvlbleDaysView, position: Int) {
        holder.itemView.tv_day.text = dayslist[position]
        if (position == posi) {
            holder.itemView.item.setBackgroundResource(R.drawable.selected_days)
            holder.itemView.tv_day.setTextColor(Color.parseColor("#5DC8D8"))
        } else {
            holder.itemView.item.setBackgroundResource(R.drawable.unselected_days)
            holder.itemView.tv_day.setTextColor(Color.parseColor("#757575"))
        }
        holder.itemView.setOnClickListener {
            posi = position
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return dayslist.size
    }
}