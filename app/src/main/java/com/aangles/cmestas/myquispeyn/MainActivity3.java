package com.aangles.cmestas.myquispeyn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {

    Button activity1;
    ImageButton close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        activity1 = (Button)findViewById(R.id.actividad1) ;
        activity1.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity3.this, MainActivity.class);
            startActivity(i);
        });

        close = (ImageButton) findViewById(R.id.imageButton2);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity3.this, MainActivity3.class);
                startActivity(i);
            }
        });

    }
}