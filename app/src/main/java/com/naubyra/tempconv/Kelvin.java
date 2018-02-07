package com.naubyra.tempconv;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kelvin extends AppCompatActivity {

    EditText kelvin;
    Button but_kel;
    TextView celsius, reaumur, fahrenheit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin);

        kelvin = findViewById(R.id.et_kel);
        but_kel = findViewById(R.id.but_kel);
        celsius = findViewById(R.id.celsius_kel);
        reaumur = findViewById(R.id.reamur_kel);
        fahrenheit = findViewById(R.id.fahrenheit_kel);

        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setDisplayHomeAsUpEnabled(true);
    }

    public void konversikel (View view){
        try{
            double nkelvin = Double.parseDouble(kelvin.getText().toString());
            nkelvin = nkelvin - 273.15;
            double ncelsius = nkelvin;
            double nfarenheit = ncelsius * 1.8 + 32;
            double nreamur = ncelsius * 0.8;
            celsius.setText(String.valueOf(ncelsius));
            fahrenheit.setText(String.valueOf(nfarenheit));
            reaumur.setText(String.valueOf(nreamur));

        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
