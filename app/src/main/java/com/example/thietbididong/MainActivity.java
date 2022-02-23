package com.example.thietbididong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn1a,btn1b,btn1c,btn1d,btn1e,btn1f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1a = findViewById(R.id.btn_1a);
        btn1b = findViewById(R.id.btn_1b);
        btn1c = findViewById(R.id.btn_1c);
        btn1d = findViewById(R.id.btn_1d);
        btn1e = findViewById(R.id.btn_1e);
        btn1f = findViewById(R.id.btn_1f);
        btn1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity1_a.class);
                startActivity(intent);
            }
        });
        btn1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity1_a.class);
                startActivity(intent);
            }
        });
        btn1c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity1_a.class);
                startActivity(intent);
            }
        });
        btn1d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity1_a.class);
                startActivity(intent);
            }
        });
        btn1e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity1_a.class);
                startActivity(intent);
            }
        });
        btn1f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity1_a.class);
                startActivity(intent);
            }
        });





    }
}