package com.example.collegeblows;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Level1 extends AppCompatActivity {

    Button b_option1, b_option2;
    TextView text, hp;
    int step, health;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("OnCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_level);
        b_option1 = findViewById(R.id.button_option1);
        b_option2 = findViewById(R.id.button_option2);
        text = findViewById(R.id.text_view);
        hp = findViewById(R.id.hp);
        step = 0;
        health = 10;
    }

    public void updateHealth(int x) {
        health += x;
        hp.setText("" + health);
        if(health<=0) {
            hp.setText("You lose");
            step = 0;

            b_option1.setText("Press any button to restart.");
            b_option2.setText("Press any button to restart.");
        }
    }
    public void option1Click(View view) {
        if(step==0) {
            hp.setText("" + health);
            text.setText("Some options will change you health");
            b_option1.setText("Lose health");
            b_option2.setText("Gain health");
            step++;
        }
        else if(step==1) {
            updateHealth(-1);
            text.setText("If you reach 0 you lose");
            b_option1.setText("Lose more health");
            b_option2.setText("Gain more health");
            step++;
        }
        else if(step==2) {
            updateHealth(-9);
            text.setText("If you reach 0 you lose");
            b_option1.setText("Lose more health");
            b_option2.setText("Gain more health");
            step++;
        }
    }
    public void option2Click(View view) {
        if(step==0) {
            hp.setText("" + health);
            text.setText("Some options will change you health");
            b_option1.setText("Lose health");
            b_option2.setText("Gain health");
            step++;
        }
        else if(step==1) {
            updateHealth(+1);
            text.setText("If you reach 0 you lose");
            b_option1.setText("Lose more health");
            b_option2.setText("Gain more health");
            step++;
        }
        else if(step==2) {
            updateHealth(+9);
            text.setText("If you reach 0 you lose");
            b_option1.setText("Lose more health");
            b_option2.setText("Gain more health");
            step++;
        }
    }
}