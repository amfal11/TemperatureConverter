package com.naubyra.tempconv;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fahrenheit extends AppCompatActivity {

    EditText fahrenheit;
    Button but_fah;
    TextView celsius, reaumur, kelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit);

        fahrenheit = findViewById(R.id.et_fah);
        but_fah = findViewById(R.id.but_fah);
        celsius = findViewById(R.id.celsius_fah);
        reaumur = findViewById(R.id.reamur_fah);
        kelvin = findViewById(R.id.kelvin_fah);

        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setDisplayHomeAsUpEnabled(true);
    }

    public void konversifah (View view){
        try{
            double nfahrenheit = Double.parseDouble(fahrenheit.getText().toString());
            nfahrenheit = nfahrenheit - 32;
            double nkelvin = nfahrenheit * 5/9 + 273.15;
            double ncelsius = nfahrenheit * 5/9;
            double nreamur = nfahrenheit* 4/9;
            kelvin.setText(String.valueOf(nkelvin));
            celsius.setText(String.valueOf(ncelsius));
            reaumur.setText(String.valueOf(nreamur));

        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
