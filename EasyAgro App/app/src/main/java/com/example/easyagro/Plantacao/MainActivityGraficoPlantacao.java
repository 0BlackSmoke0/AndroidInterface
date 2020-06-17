package com.example.easyagro.Plantacao;


import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;

import com.example.easyagro.R;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;

public class MainActivityGraficoPlantacao extends AppCompatActivity {


    GraphView grafica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_grafico_plantacao);

        getSupportActionBar().hide();
        grafica = findViewById(R.id.grafica);

        BarGraphSeries<DataPoint> series = new BarGraphSeries<>(new DataPoint[]{
                new DataPoint(0, 1),
                new DataPoint(1, 8),
                new DataPoint(2, 3),
                new DataPoint(3,4),
                new DataPoint(4,6)
        });

        grafica.addSeries(series);

        series.setValueDependentColor(new ValueDependentColor<DataPoint>() {
            @Override public int get(DataPoint data) {
                return Color.rgb((int) data.getX()*102/4, (int) Math.abs(data.getY()*188/6), 100);
            }
        });

        series.setSpacing(60);
        series.setDrawValuesOnTop(true);
        series.setValuesOnTopColor(Color.BLACK);
    }
}


