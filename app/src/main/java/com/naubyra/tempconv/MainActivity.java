package com.naubyra.tempconv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Membaca file menu dan menambahkan isinya ke action bar jika ada.
        getMenuInflater().inflate(R.menu.about, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void CelC(View view) {
        Intent intent = new Intent(MainActivity.this, Celcius.class);
        startActivity(intent);
    }

    public void ReaC(View view) {
        Intent intent = new Intent(MainActivity.this, Reamur.class);
        startActivity(intent);
    }

    public void FahC(View view) {
        Intent intent = new Intent(MainActivity.this, Fahrenheit.class);
        startActivity(intent);
    }

    public void KelC(View view) {
        Intent intent = new Intent(MainActivity.this, Kelvin.class);
        startActivity(intent);
    }

    public void About(MenuItem mi) {
        Intent intent = new Intent(MainActivity.this, About.class);
        startActivity(intent);
    }

}
