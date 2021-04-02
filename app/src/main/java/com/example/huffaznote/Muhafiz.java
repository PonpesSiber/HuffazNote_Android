package com.example.huffaznote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Muhafiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muhafiz);

        Button MenuDaftar = findViewById(R.id.btn_Daftar);
        MenuDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_Muhafiz = new Intent(Muhafiz.this,
                        MenuDaftar.class);
                startActivity(intent_Muhafiz);
            }
        });
    }
}