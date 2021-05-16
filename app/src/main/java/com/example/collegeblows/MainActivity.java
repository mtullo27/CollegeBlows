package com.example.collegeblows;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b_play, b_instructions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("OnCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_play = findViewById(R.id.button_play);
        b_instructions = findViewById(R.id.button_instructions);
    }

    public void playClick(View view) {
        System.out.println("Hello");
        Intent intent =  new Intent(this, FirstLevel.class);
        System.out.println("After Intent");
        startActivity(intent);
        System.out.println("Last");
    }
    public void instructionClick(View view) {
        Intent intent =  new Intent(this, Instruction2.class);
        startActivity(intent);
    }

    public void charClick(View v){
        Intent intent = new Intent(this, CharacterCreation.class);
        startActivity(intent);
    }
}