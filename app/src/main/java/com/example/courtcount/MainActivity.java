package com.example.courtcount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        int a=0;
        int b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView TeamA=(TextView)findViewById(R.id.TeamA);
        TextView TeamB=(TextView)findViewById(R.id.TeamB);
        final TextView ScoreA=(TextView)findViewById(R.id.ScoreA);
        final TextView ScoreB=(TextView)findViewById(R.id.ScoreB);
        Button plus3A=(Button)findViewById(R.id.plus3A);
        Button plus3B=(Button)findViewById(R.id.plus3B);
        Button plus2A=(Button)findViewById(R.id.plus2A);
        Button plus2B=(Button)findViewById(R.id.plus2B);
        Button freeA=(Button)findViewById(R.id.freeA);
        Button freeB=(Button)findViewById(R.id.freeB);
        Button reset=(Button)findViewById(R.id.reset);



        plus3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=a+3;
            ScoreA.setText(String.valueOf(a));
            }
        });
        plus3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=b+3;
                ScoreB.setText(String.valueOf(b));
            }
        });
        plus2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=a+2;
                ScoreA.setText(String.valueOf(a));
            }
        });
        plus2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=b+2;
                ScoreB.setText(String.valueOf(b));
            }
        });
        freeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=a+1;
                ScoreA.setText(String.valueOf(a));
            }
        });
        freeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=b+1;
                ScoreB.setText(String.valueOf(b));
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=0;
                b=0;
                ScoreA.setText(String.valueOf(a));
                ScoreB.setText(String.valueOf(b));
            }
        });


    }
}