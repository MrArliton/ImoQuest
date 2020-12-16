package com.example.Imo;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.Imo.bin.loadTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton t1 = findViewById(R.id.ib1);
        ImageButton t2 = findViewById(R.id.ib);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Question.class);
                loadTest.tsN = 2;
                loadTest.ts = 1;
                loadTest.rx = false;
                loadTest.nx = true;
                new loadTest().loadTest();
                startActivity(intent);
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Question.class);
                loadTest.tsN = 1;
                loadTest.ts = 1;
                loadTest.rx = false;
                loadTest.nx = false;
                new loadTest().loadTest();
                startActivity(intent);
            }
        });
    }
}