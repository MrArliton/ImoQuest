package com.example.Imo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.Imo.bin.FinallQuest;
import com.example.Imo.bin.loadTest;

public class Question extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        if(!loadTest.nx){
            new loadTest().loadTest();
        }
        if(loadTest.rx){
            Intent intent = new Intent(Question.this, FinallQuest.class);
            startActivity(intent);
        }
        TextView quest = findViewById(R.id.questTW);
        TextView q1 = findViewById(R.id.ts1TX);
        TextView q2 = findViewById(R.id.ts1TX2);
        TextView q3 = findViewById(R.id.ts1TX3);
        TextView q4 = findViewById(R.id.ts1TX4);
        quest.setText(loadTest.question);
        q1.setText(loadTest.Q1);
        q2.setText(loadTest.Q2);
        q3.setText(loadTest.Q3);
        q4.setText(loadTest.Q4);
        ImageButton b1 = findViewById(R.id.ts);
        ImageButton b2 = findViewById(R.id.ts4);
        ImageButton b3 = findViewById(R.id.ts5);
        ImageButton b4 = findViewById(R.id.ts6);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                if(!loadTest.nx) {
                     intent = new Intent(Question.this, Question.class);
                }else{
                     intent = new Intent(Question.this, FinallQuest.class);
                    loadTest.buff = 1;
                }
                loadTest.Summ+=loadTest.S1;
                loadTest.ts=loadTest.ts+1;
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                if(!loadTest.nx) {
                    intent = new Intent(Question.this, Question.class);
                }else{
                    intent = new Intent(Question.this, FinallQuest.class);
                    loadTest.buff = 2;
                }
                loadTest.Summ+=loadTest.S2;
                loadTest.ts=loadTest.ts+1;
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                if(!loadTest.nx) {
                    intent = new Intent(Question.this, Question.class);
                }else{
                    intent = new Intent(Question.this, FinallQuest.class);
                    loadTest.buff = 3;
                }
                loadTest.Summ+=loadTest.S3;
                loadTest.ts=loadTest.ts+1;
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                if(!loadTest.nx) {
                    intent = new Intent(Question.this, Question.class);
                }else{
                    intent = new Intent(Question.this, FinallQuest.class);
                    loadTest.buff = 4;
                }
                loadTest.Summ+=loadTest.S4;
                loadTest.ts=loadTest.ts+1;
                startActivity(intent);
            }
        });
    }
}