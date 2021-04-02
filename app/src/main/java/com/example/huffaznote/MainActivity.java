package com.example.huffaznote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mustami = findViewById(R.id.mustami);
        mustami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_mustami = new Intent(MainActivity.this, Mustami.class);
                startActivity(intent_mustami);
            }
        });

        Button muhafiz = findViewById(R.id.muhafiz);
        muhafiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_muhafiz = new Intent(MainActivity.this, Muhafiz.class);
                startActivity(intent_muhafiz);
            }
        });
    }
}