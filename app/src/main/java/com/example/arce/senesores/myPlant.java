package com.example.arce.senesores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class myPlant extends AppCompatActivity {

    ProgressBar prg;
    int humedad=1;
    int temp = 19;
    int luz=395;
    int wellness=0;
    int maxL=500;
    int maxH=5;
    TextView tvTemp;
    TextView tvLuz;
    TextView tvHum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_plant);
        prg=(ProgressBar)findViewById(R.id.pb_wellness);
        tvTemp=(TextView) findViewById(R.id.tv_temp);
        tvLuz=(TextView)findViewById(R.id.tv_luz);
        tvHum=(TextView)findViewById(R.id.tv_hum);
        setInfo();
        setProgress();
        prg.setScaleY(5f);
        prg.setProgress(wellness);
    }

    public void setInfo(){
        tvTemp.setText("Temperatura: " + String.valueOf(temp) + "°C");
        luz= luz*100/maxL;
        tvLuz.setText("Luz: " + String.valueOf(luz) + "%");
        humedad= humedad*100/maxH;
        tvHum.setText("Humedad: " + String.valueOf(humedad) + "%");
    }

    public void setProgress(){
        if(temp<18)
            {wellness=10;}
        else
            if(temp<25)
            {wellness=30;}
        else{wellness=20;}

        if(luz<35)
        {wellness+=10;}
        else
        if(luz<80)
        {wellness+=20;}
        else{wellness+=35;}

        if(humedad<35)
        {wellness+=10;}
        else
        if(humedad<80)
        {wellness+=20;}
        else{wellness+=35;}


    }
}
