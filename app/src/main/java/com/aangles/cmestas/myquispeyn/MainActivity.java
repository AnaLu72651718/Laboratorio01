package com.aangles.cmestas.myquispeyn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button activity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity2 = (Button)findViewById(R.id.actividad2) ;
        activity2.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(i);
        });
    }
}