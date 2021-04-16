package com.example.collegeblows;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Instructions extends AppCompatActivity {

    Button b_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instructions);
        b_back =(Button) findViewById(R.id.button_back);
    }

    public void backClick(View view) {
        Intent intent =  new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}