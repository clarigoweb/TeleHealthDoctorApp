package com.app.telehealthdoctor.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.app.telehealthdoctor.R
import com.app.telehealthdoctor.ui.utils.Utils
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import kotlinx.android.synthetic.main.fragment_revenue.view.*
import java.util.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RevenueFrag.newInstance] factory method to
 * create an instance of this fragment.
 */
class RevenueFrag : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_revenue, container, false)

        setUpTotalrevenueChart(view)
        Utils.getChartData(view.pie_chart)

        return view
    }

    private fun setUpTotalrevenueChart(view: View) {

        val entries: ArrayList<BarEntry> = ArrayList()
        entries.add(BarEntry(1f, 4f))
        entries.add(BarEntry(2f, 10f))
        entries.add(BarEntry(3f, 2f))
        entries.add(BarEntry(4f, 15f))
        entries.add(BarEntry(5f, 13f))
        entries.add(BarEntry(6f, 2f))
        entries.add(BarEntry(7f, 4f))

        val barDataSet = BarDataSet(entries, "")

        barDataSet.setColors(resources.getColor(R.color.main_color))
        val data = BarData(barDataSet)
        view.barChart_revenue.data = data
        //hide grid lines
        view.barChart_revenue.axisLeft.setDrawGridLines(false)
        view.barChart_revenue.xAxis.setDrawGridLines(false)
        view.barChart_revenue.xAxis.setDrawAxisLine(false)
        //remove right y-axis
        view.barChart_revenue.axisRight.isEnabled = false
        //remove legend
        view.barChart_revenue.legend.isEnabled = false
        //remove description label
        view.barChart_revenue.description.isEnabled = false
        //add animation
        view.barChart_revenue.animateY(3000)
        //draw chart
        view.barChart_revenue.invalidate()

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment RevenueFrag.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RevenueFrag().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

