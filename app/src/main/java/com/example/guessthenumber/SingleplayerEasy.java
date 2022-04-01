package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SingleplayerEasy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleplayer_easy);
    }

    int randomNum = (int) Math.floor(Math.random()*(10)+1);
    int lives = 3;

    public void submitGuess(View v) {
        //getting guess from input
        EditText inputBox = (EditText) findViewById(R.id.input);
        String str = inputBox.getText().toString();
        int guess = Integer.parseInt(str);
        //determines if right or wrong
        String isSame;
        if (guess == randomNum){
            isSame = guess+" "+randomNum+" "+"Correct!";
            startActivity(new Intent(SingleplayerEasy.this, WinnerScreen.class));
        }else{
            isSame = guess+" "+randomNum+" "+"Try again";
            lives--;
        }
        //if out of lives then change page
        if (lives == 0){
            startActivity(new Intent(SingleplayerEasy.this, LoserScreen.class));
        }
        //update output and lives display
        ((TextView) findViewById(R.id.output)).setText(isSame);
        ((TextView) findViewById(R.id.lives)).setText("Lives: "+lives);
    }
}