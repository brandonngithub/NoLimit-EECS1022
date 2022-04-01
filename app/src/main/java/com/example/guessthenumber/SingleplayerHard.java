package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SingleplayerHard extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleplayer_hard);
    }
    int randomNum = (int) Math.floor(Math.random()*(100)+1);
    int lives = 3;

    public void buttonClicked(View v) {
        EditText inputBox = (EditText) findViewById(R.id.input);
        String str = inputBox.getText().toString();
        int guess = Integer.parseInt(str);

        String isSame = null;
        if (guess == randomNum){
            startActivity(new Intent(SingleplayerHard.this, WinnerScreen.class));
        }else{
            isSame = guess+" "+randomNum+" "+"Try again";
            lives--;
        }
        //if out of lives then change page
        if (lives == 0){
            startActivity(new Intent(SingleplayerHard.this, LoserScreen.class));
        }
        //update output and lives display
        ((TextView) findViewById(R.id.output)).setText(isSame);
        ((TextView) findViewById(R.id.lives)).setText("Lives: "+lives);
        ((TextView) findViewById(R.id.howCloseIsGuess)).setText(howClose(randomNum,guess));
    }
    public String howClose(int num1, int num2)
    {
        String str;
        int diff = num1 - num2;
        if(Math.abs(diff) <= 25)
        {
            str = "Your guess is close!";
        }
        else if(25 < Math.abs(diff) && Math.abs(diff) <= 50)
        {
            str = "Your guess is not too far off!";
        }
        else
        {
            str = "Your guess is pretty far off";
        }
        return str;

    }
}
