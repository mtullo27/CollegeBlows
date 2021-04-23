package com.example.collegeblows;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Instruction2 extends AppCompatActivity {

    Button b_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("OnCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction2);


        b_back = findViewById(R.id.button_back);
    }


    public void backClick(View view) {
        System.out.println("Hello");
        Intent intent =  new Intent(this, MainActivity.class);
        System.out.println("After Intent");
        startActivity(intent);
        System.out.println("Last");
    }
}