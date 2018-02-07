package com.naubyra.tempconv;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Reamur extends AppCompatActivity {

    EditText reaumur;
    Button cvt_rea;
    TextView celsius, fahrenheit, kelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reamur);

        reaumur = findViewById(R.id.et_rea);
        cvt_rea = findViewById(R.id.but_rea);
        celsius = findViewById(R.id.celsius_rea);
        fahrenheit = findViewById(R.id.fahrenheit_rea);
        kelvin = findViewById(R.id.kelvin_rea);

        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setDisplayHomeAsUpEnabled(true);
    }

    public void konversirea (View view){
        try{
            double nreaumur = Double.parseDouble(reaumur.getText().toString());
            double ncelsius = nreaumur * 5/4;
            double nfarenheit = nreaumur * 9/4 + 32;
            double nkelvin = ncelsius + 273.15;
            kelvin.setText(String.valueOf(nkelvin));
            fahrenheit.setText(String.valueOf(nfarenheit));
            celsius.setText(String.valueOf(ncelsius));

        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
