package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button screen1,screen2,screen3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen1 = findViewById(R.id.screen_1);
        screen2 = findViewById(R.id.screen_2);
        screen3 = findViewById(R.id.screen_3);


        screen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ScreenActivity1.class);
                startActivity(intent);

            }
        });

        screen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ScreenActivity2.class);
                startActivity(intent);
            }
        });

        screen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ScreenActivity3.class);
                startActivity(intent);
            }
        });

    }
}