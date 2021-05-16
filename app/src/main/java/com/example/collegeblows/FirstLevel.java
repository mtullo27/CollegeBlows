package com.example.collegeblows;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstLevel extends AppCompatActivity {
    Button b_option1, b_option2;
    TextView text;
    int step;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("OnCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_level);
        b_option1 = findViewById(R.id.button_option1);
        b_option2 = findViewById(R.id.button_option2);
        text = findViewById(R.id.text_view);
        step = 0;
    }


    public void option1Click(View view) {
        if(step==0) {
            text.setText("Text has changed");
            b_option1.setText("Oh no, you've been removed from your housing");
            step++;
        }
    }
    public void option2Click(View view) {
        if(step==0) {
            step++;
            text.setText("Text has changed");
            b_option2.setText("option2 has changed");
            step++;
        }
    }
}