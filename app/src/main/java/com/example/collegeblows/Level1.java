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
            text.setText("You wake up feeling hungry, what do you want to eat?");
            b_option1.setText("A healthy breakfast");
            b_option2.setText("A dining hall muffin");
            step++;
        }
        else if(step==1) {
            updateHealth(+2);
            text.setText("Now that you've eaten, its time to start the day");
            b_option1.setText("Grab a coat");
            b_option2.setText("Who needs a coat");
            step++;
        }
        else if(step==2) {
            updateHealth(+3);
            text.setText("On your way out you notice your roommate hasn't done his dishes");
            b_option1.setText("Ask him nicely to do them");
            b_option2.setText("Intimidate him into doing them");
            step++;
        }
        else if(step==3) {
            if(true) {//char check
                text.setText("Your roommate happily says he'll do them, time to go to class");
                b_option1.setText("Walk there");
                b_option2.setText("Take the bus");
            }
            else {
                updateHealth(-1);
                text.setText("Your roommate slaps you and walks away, time to go to class");
                b_option1.setText("Walk there");
                b_option2.setText("Take the bus");
            }
            step++;
        }
        else if(step==4) {
            text.setText("Oh no, you forgot you had a test today and didn't study");
            b_option1.setText("Do your best on the test");
            b_option2.setText("Try to cheat off the guy next to you");
            step++;
        }
        else if(step==5) {
            if(true) {//int check
                text.setText("The test was easy for you so you leave");
                b_option1.setText("Walk away happy");
                b_option2.setText("Walk away unbothered");
            }
            else {
                updateHealth(-5);
                text.setText("That test whooped your ass and you leave");
                b_option1.setText("Walk away sad");
                b_option2.setText("Walk away unbothered");
            }
            step++;
        }
        else if(step==6) {
            text.setText("You remember you're being kicked out of your dorm and decide to go confront Harvey");
            b_option1.setText("Walk there");
            b_option2.setText("Take the bus");
            step++;
        }
        else if(step==7) {
            text.setText("You enter Harvey's office and he asks you to sit down");
            b_option1.setText("Sit down");
            b_option2.setText("Keep standing");
            step++;
        }
        else if(step==8) {
            text.setText("Harvey make you an offer, if you can beat him in a duel you can have your room");
            b_option1.setText("Accept");
            b_option2.setText("Accept but the second option");
            step++;
        }
        else if(step==9) {
            text.setText("Harvey quickly throws his chair at you");
            b_option1.setText("Try to dodge it");
            b_option2.setText("Block the chair with your arms");
            step++;
        }
        else if(step==10) {
            if(true) {//const check
                text.setText("You quickly dodge the chair and its time to strike back");
                b_option1.setText("Throw your own chair");
                b_option2.setText("Throw a punch at him");
            }
            else {
                updateHealth(-4);
                text.setText("The chair smacks into your head, but its time to strike back");
                b_option1.setText("Throw your own chair");
                b_option2.setText("Throw a punch at him");
            }
            step++;
        }
        else if(step==11) {
            text.setText("Harvey is knocked down from your attack, but tries to sweep your leg");
            b_option1.setText("Limbo under it");
            b_option2.setText("Jump over it");
            step++;
        }
        else if(step==12) {
            text.setText("You dodge his attack");
            b_option1.setText("Stand over him triumphantly");
            b_option2.setText("Grab a pen to defend yourself");
            step++;
        }
        else if(step==13) {
            text.setText("Fine you win, Harvey says, you can have your room back");
            b_option1.setText("Thank him");
            b_option2.setText("Leave without saying anything");
            step++;
        }
        else if(step==14) {
            text.setText("Congrats you win");
            b_option1.setText("good job!");
            b_option2.setText("you did well");
            step++;
        }
    }
    public void option2Click(View view) {
        if(step==0) {
            hp.setText("" + health);
            text.setText("You wake up feeling hungry, what do you want to eat?");
            b_option1.setText("A healthy breakfast");
            b_option2.setText("A dining hall muffin");
            step++;
        }
        else if(step==1) {
            updateHealth(+5);
            text.setText("Now that you've eaten, its time to start the day");
            b_option1.setText("Grab a coat");
            b_option2.setText("Who needs a coat");
            step++;
        }
        else if(step==2) {
            updateHealth(+5);
            text.setText("On your way out you notice your roommate hasn't done his dishes");
            b_option1.setText("Ask him nicely to do them");
            b_option2.setText("Intimidate him into doing them");
            step++;
        }
        else if(step==3) {
            if(true) {//str check
                text.setText("Your roommate shivering, says he'll do them, time to go to class");
                b_option1.setText("Walk there");
                b_option2.setText("Take the bus");
            }
            else {
                updateHealth(-1);
                text.setText("Your roommate slaps you and walks away, time to go to class");
                b_option1.setText("Walk there");
                b_option2.setText("Take the bus");
            }
            step++;
        }
        else if(step==4) {
            text.setText("Oh no, you forgot you had a test today and didn't study");
            b_option1.setText("Do your best on the test");
            b_option2.setText("Try to cheat off the guy next to you");
            step++;
        }
        else if(step==5) {
            if(true) {//dex check
                text.setText("The kid next to you left his paper wide open and the test was easy");
                b_option1.setText("Walk away happy");
                b_option2.setText("Walk away unbothered");
            }
            else {
                updateHealth(-10);
                text.setText("The teacher caught you and kicked you out");
                b_option1.setText("Walk away sad");
                b_option2.setText("Walk away unbothered");
            }
            step++;
        }
        else if(step==6) {
            text.setText("You remember you're being kicked out of your dorm and decide to go confront Harvey");
            b_option1.setText("Walk there");
            b_option2.setText("Take the bus");
            step++;
        }
        else if(step==7) {
            text.setText("You enter Harvey's office and he asks you to sit down");
            b_option1.setText("Sit down");
            b_option2.setText("Keep standing");
            step++;
        }
        else if(step==8) {
            text.setText("Harvey make you an offer, if you can beat him in a duel you can have your room");
            b_option1.setText("Accept");
            b_option2.setText("Accept but the second option");
            step++;
        }
        else if(step==9) {
            text.setText("Harvey quickly throws his chair at you");
            b_option1.setText("Try to dodge it");
            b_option2.setText("Block the chair with your arms");
            step++;
        }
        else if(step==10) {
            if(true) {//const check
                text.setText("The chair shatters on your arms and its time to strike back");
                b_option1.setText("Throw your own chair");
                b_option2.setText("Throw a punch at him");
            }
            else {
                updateHealth(-4);
                text.setText("The chair smacks into your head, but its time to strike back");
                b_option1.setText("Throw your own chair");
                b_option2.setText("Throw a punch at him");
            }
            step++;
        }
        else if(step==11) {
            text.setText("Harvey is knocked down from your attack, but tries to sweep your leg");
            b_option1.setText("Limbo under it");
            b_option2.setText("Jump over it");
            step++;
        }
        else if(step==12) {
            updateHealth(-5);
            text.setText("You get knocked over but get back up");
            b_option1.setText("Stand over him triumphantly");
            b_option2.setText("Grab a pen to defend yourself");
            step++;
        }
        else if(step==13) {

            text.setText("Fine you win, Harvey says, you can have your room back");
            b_option1.setText("Thank him");
            b_option2.setText("Leave without saying anything");
            step++;
        }
        else if(step==14) {
            text.setText("Congrats you win");
            b_option1.setText("good job!");
            b_option2.setText("you did well");
            step++;
        }

    }
}