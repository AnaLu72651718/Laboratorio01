package com.aangles.cmestas.myquispeyn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    Button activity1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        activity1 = (Button)findViewById(R.id.actividad1) ;
        activity1.setOnClickListener(v -> {
            Intent i = new Intent(Activity2.this, MainActivity.class);
            startActivity(i);
        });

    }


}