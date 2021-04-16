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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_play = findViewById(R.id.button_play);
        b_instructions = findViewById(R.id.button_instructions);
    }

    public void playClick(View view) {
        Intent intent =  new Intent(this, Play.class);
        startActivity(intent);
    }

    public void instructionClick(View view) {
        Intent intent =  new Intent(this, Instructions.class);
        startActivity(intent);
    }
}