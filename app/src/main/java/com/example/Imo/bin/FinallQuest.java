package com.example.Imo.bin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.Imo.MainActivity;
import com.example.Imo.Question;
import com.example.Imo.R;

public class FinallQuest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finall_quest);
        TextView rs = findViewById(R.id.Result);
        ImageButton ex = findViewById(R.id.tsExit);
        TextView ext = findViewById(R.id.exitT);
        if(loadTest.nx) {
            if(loadTest.buff<2){
                rs.setText(loadTest.SNX1);
            }else if(loadTest.buff==2){
                rs.setText(loadTest.SNX2);
            }else if(loadTest.buff==3){
                rs.setText(loadTest.SNX3);
            }else if(loadTest.buff==4){
                rs.setText(loadTest.SNX4);
            }
        }else{
            rs.setText(loadTest.result);
        }
        new loadTest().loadTest();
        if(loadTest.nx){
            if(!loadTest.rx){
                ext.setText("Продолжить");
            }else{
                ext.setText("Завершить тест");
            }
        }

        ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                if(!loadTest.nx) {
                     intent = new Intent(FinallQuest.this, MainActivity.class);
                    loadTest.Summ=0;
                    loadTest.ts=0;
                }else{
                    if(!loadTest.rx) {
                        intent = new Intent(FinallQuest.this, Question.class);
                    }else{
                        loadTest.nx = false;
                        intent = new Intent(FinallQuest.this, MainActivity.class);
                    }
                }
                startActivity(intent);
            }
        });
    }
}