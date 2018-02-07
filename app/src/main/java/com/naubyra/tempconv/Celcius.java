package com.naubyra.tempconv;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Celcius extends AppCompatActivity {

    EditText celcius;
    Button cvt_cel;
    TextView reaumur, fahrenheit, kelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celcius);

        celcius = findViewById(R.id.et_cel);
        reaumur = findViewById(R.id.reaumur_cel);
        fahrenheit = findViewById(R.id.fahrenheit_cel);
        kelvin = findViewById(R.id.kelvin_cel);
        cvt_cel = findViewById(R.id.btn_cel);

        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setDisplayHomeAsUpEnabled(true);
    }

    public void konversicel (View view){
        try{
            double ncelcius = Double.parseDouble(celcius.getText().toString());
            double nkelvin = ncelcius + 273.15;
            double nfarenheit = ncelcius * 9/5  + 32;
            double nreamur = ncelcius * 0.8;
            kelvin.setText(String.valueOf(nkelvin));
            fahrenheit.setText(String.valueOf(nfarenheit));
            reaumur.setText(String.valueOf(nreamur));

        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
