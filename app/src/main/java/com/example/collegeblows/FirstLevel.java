package com.example.collegeblows;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstLevel extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("OnCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_level);

    }


    public void instructionClick(View view) {
        System.out.println("Hello");
        Intent intent =  new Intent(this, Instruction2.class);
        System.out.println("After Intent");
        startActivity(intent);
        System.out.println("Last");
    }
}