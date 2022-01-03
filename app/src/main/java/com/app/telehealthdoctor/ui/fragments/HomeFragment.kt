package com.app.telehealthdoctor.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.telehealthdoctor.R
import com.app.telehealthdoctor.ui.adaptors.ScheduleAdaptor
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.michalsvec.singlerowcalendar.calendar.CalendarChangesObserver
import com.michalsvec.singlerowcalendar.calendar.CalendarViewManager
import com.michalsvec.singlerowcalendar.calendar.SingleRowCalendarAdapter
import com.michalsvec.singlerowcalendar.selection.CalendarSelectionManager
import com.michalsvec.singlerowcalendar.utils.DateUtils
import kotlinx.android.synthetic.main.calendar_item.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.second_special_calendar_item.*
import java.util.*


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class HomeFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    private val calendar = Calendar.getInstance()
    private var currentMonth = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view: View = inflater.inflate(R.layout.fragment_home, container, false)
        calendarSetup(view)
        setUpScheduleAdaptor(view)
        setUpChart(view)

        return view
    }

    //flow chart link
//https://intensecoder.com/bar-chart-tutorial-in-android-using-kotlin/
    private fun setUpChart(view: View) {
        val entries: ArrayList<BarEntry> = ArrayList()
        entries.add(BarEntry(1f, 4f))
        entries.add(BarEntry(2f, 10f))
        entries.add(BarEntry(3f, 2f))
        entries.add(BarEntry(4f, 15f))
        entries.add(BarEntry(5f, 13f))
        entries.add(BarEntry(6f, 2f))

        val barDataSet = BarDataSet(entries, "")
        barDataSet.setColors(resources.getColor(R.color.main_color))

        val data = BarData(barDataSet)
        view.barChart.data = data


        //hide grid lines
        view.barChart.axisLeft.setDrawGridLines(false)
        view.barChart.xAxis.setDrawGridLines(false)
        view.barChart.xAxis.setDrawAxisLine(false)

        //remove right y-axis
        view.barChart.axisRight.isEnabled = false

        //remove legend
        view.barChart.legend.isEnabled = false


        //remove description label
        view.barChart.description.isEnabled = false


        //add animation
        view.barChart.animateY(3000)


        //draw chart
        view.barChart.invalidate()
    }

    private fun setUpScheduleAdaptor(view: View) {
        view.rv_schedule.layoutManager = LinearLayoutManager(activity)
        view.rv_schedule.adapter = ScheduleAdaptor()
    }

    private fun calendarSetup(view: View) {
        // set current date to calendar and current month to currentMonth variable
        calendar.time = Date()
        currentMonth = calendar[Calendar.MONTH]


        // calendar view manager is responsible for our displaying logic
        var myCalendarViewManager = object :
            CalendarViewManager {
            override fun setCalendarViewResourceId(
                position: Int, date: Date, isSelected: Boolean
            ): Int {
                // set date to calendar according to position where we are
                val cal = Calendar.getInstance()
                cal.time = date
                // if item is selected we return this layout items
                // in this example. monday, wednesday and friday will have special item views and other days
                // will be using basic item view
                return if (isSelected)
                    R.layout.selected_calendar_item
                else
                // here we return items which are not selected
                    R.layout.calendar_item
//                    when (cal[Calendar.DAY_OF_WEEK]) {
//                        Calendar.MONDAY -> R.layout.first_special_calendar_item
//                        Calendar.WEDNESDAY -> R.layout.second_special_calendar_item
//                        Calendar.FRIDAY -> R.layout.third_special_calendar_item
//                        else -> R.layout.calendar_item
//                    }

                // NOTE: if we don't want to do it this way, we can simply change color of background
                // in bindDataToCalendarView method
            }

            override fun bindDataToCalendarView(
                holder: SingleRowCalendarAdapter.CalendarViewHolder,
                date: Date,
                position: Int,
                isSelected: Boolean
            ) {
                // using this method we can bind data to calendar view
                // good practice is if all views in layout have same IDs in all item views
                holder.itemView.tv_date_calendar_item.text = DateUtils.getDayNumber(date)
                holder.itemView.tv_day_calendar_item.text = DateUtils.getDay3LettersName(date)

            }
        }

        // using calendar changes observer we can track changes in calendar
        val myCalendarChangesObserver = object :
            CalendarChangesObserver {
            // you can override more methods, in this example we need only this one
            override fun whenSelectionChanged(isSelected: Boolean, position: Int, date: Date) {
                tv_date_calendar_item.text =
                    "${DateUtils.getMonthName(date)}, ${DateUtils.getDayNumber(date)} "
                tv_day_calendar_item.text = DateUtils.getDayName(date)
                super.whenSelectionChanged(isSelected, position, date)
            }


        }

        // selection manager is responsible for managing selection
        val mySelectionManager = object : CalendarSelectionManager {
            override fun canBeItemSelected(position: Int, date: Date): Boolean {
                // set date to calendar according to position
                val cal = Calendar.getInstance()
                cal.time = date
                // in this example sunday and saturday can't be selected, others can
                return when (cal[Calendar.DAY_OF_WEEK]) {
//                    Calendar.SATURDAY -> false
//                    Calendar.SUNDAY -> false
                    else -> true
                }
            }
        }

        // here we init our calendar, also you can set more properties if you haven't specified in XML layout
        view.main_single_row_calendar.apply {
            calendarViewManager = myCalendarViewManager
            calendarChangesObserver = myCalendarChangesObserver
            calendarSelectionManager = mySelectionManager

            futureDaysCount = 30
            includeCurrentDate = true

            setDates(getFutureDatesOfCurrentMonth())
            init()

        }

//        btnRight.setOnClickListener {
//            singleRowCalendar.setDates(getDatesOfNextMonth())
//        }
//
//        btnLeft.setOnClickListener {
//            singleRowCalendar.setDates(getDatesOfPreviousMonth())
//        }


    }

    private fun getDatesOfNextMonth(): List<Date> {
        currentMonth++ // + because we want next month
        if (currentMonth == 12) {
            // we will switch to january of next year, when we reach last month of year
            calendar.set(Calendar.YEAR, calendar[Calendar.YEAR] + 1)
            currentMonth = 0 // 0 == january
        }
        return getDates(mutableListOf())
    }

    private fun getDatesOfPreviousMonth(): List<Date> {
        currentMonth-- // - because we want previous month
        if (currentMonth == -1) {
            // we will switch to december of previous year, when we reach first month of year
            calendar.set(Calendar.YEAR, calendar[Calendar.YEAR] - 1)
            currentMonth = 11 // 11 == december
        }
        return getDates(mutableListOf())
    }

    private fun getFutureDatesOfCurrentMonth(): List<Date> {
        // get all next dates of current month
        currentMonth = calendar[Calendar.MONTH]
        return getDates(mutableListOf())
    }


    private fun getDates(list: MutableList<Date>): List<Date> {
        // load dates of whole month
        calendar.set(Calendar.MONTH, currentMonth)
        calendar.set(Calendar.DAY_OF_MONTH, 1)
        list.add(calendar.time)
        while (currentMonth == calendar[Calendar.MONTH]) {
            calendar.add(Calendar.DATE, +1)
            if (calendar[Calendar.MONTH] == currentMonth)
                list.add(calendar.time)
        }
        calendar.add(Calendar.DATE, -1)
        return list
    }
}