package com.example.collegeblows;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        configureInstructionButton();
    }
    public void configureInstructionButton(){
        Button b_instructions = (Button) findViewById(R.id.button_instructions);
        b_instructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Instructions.class));
            }
        });
    }

}