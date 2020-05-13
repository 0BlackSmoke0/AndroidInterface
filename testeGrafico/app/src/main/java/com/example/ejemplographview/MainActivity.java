package com.example.ejemplographview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;

public class MainActivity extends AppCompatActivity {

    GraphView grafica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grafica = findViewById(R.id.grafica);

        BarGraphSeries<DataPoint> series = new BarGraphSeries<>(new DataPoint[]{
           new DataPoint(0, 1),
           new DataPoint(1, 5),
           new DataPoint(2, 3),
           new DataPoint(3, 2),
           new DataPoint(4, 6)

        });

        grafica.addSeries(series);

        series.setValueDependentColor(new ValueDependentColor<DataPoint>() {
            @Override
            public int get(DataPoint data) {
                return Color.rgb((int)data.getX()*255/4, (int) data.getY()*255/6, 100);
            }
        });

        series.setSpacing(20);

        series.setDrawValuesOnTop(true);
        series.setValuesOnTopColor(Color.BLUE);
    }
}
