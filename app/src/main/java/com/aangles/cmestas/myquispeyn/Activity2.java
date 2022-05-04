package com.aangles.cmestas.myquispeyn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView mensaje;
    Button activity1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //mensaje = (TextView) findViewById(R.id.mensaje);



        activity1 = (Button)findViewById(R.id.actividad1) ;
        activity1.setOnClickListener(v -> {
            Intent i = new Intent(Activity2.this, MainActivity.class);
            startActivity(i);
        });

    }




}