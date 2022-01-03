package com.app.telehealthdoctor.ui.utils;

import android.graphics.Color;

import com.intrusoft.scatter.ChartData;
import com.intrusoft.scatter.PieChart;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static void getChartData(PieChart simple_chart) {
        List<ChartData> data = new ArrayList<>();
        data.add(new ChartData("First", 35, Color.parseColor("#0091EA"), Color.parseColor("#0091EA")));
        data.add(new ChartData("Second", 25, Color.parseColor("#33691E"), Color.parseColor("#33691E")));
        data.add(new ChartData("Third", 30, Color.parseColor("#5DC8D8"), Color.parseColor("#5DC8D8")));
//        data.add(new ChartData("Fourth", 10, Color.parseColor("#FFD600"), Color.parseColor("#FFD600")));
        simple_chart.setChartData(data);

    }
}
