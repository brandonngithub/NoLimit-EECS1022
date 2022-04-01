package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Multiplayer extends AppCompatActivity {
    Button button_one;
    Button button_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer);

        button_one = (Button) findViewById(R.id.button_one);
        button_two = (Button) findViewById(R.id.button_two);
    }

    int randomNum = (int) Math.floor(Math.random()*(10)+1);
    int triesOne = 0;
    int triesTwo = 0;

    public void guessOne(View view) {
        //getting guess from input
        EditText input_one = (EditText) findViewById(R.id.input_one);
        int guess = Integer.parseInt(input_one.getText().toString());
        //determines if right or wrong
        String isSame = null;
        if (guess == randomNum){
            button_one.setEnabled(false);
        }else{
            isSame = guess+" "+randomNum+" "+"Try again";
        }
        triesOne++;
        ((TextView) findViewById(R.id.output_one)).setText(isSame);
        ((TextView) findViewById(R.id.tries_one)).setText("Tries: "+triesOne);
        //next page if both done
        String winner = "";
        if (!button_one.isEnabled() && !button_two.isEnabled()){
            //determines winner
            if (triesTwo > triesOne)
                winner = "Player One wins!";
            else if (triesOne > triesTwo)
                winner = "Player Two wins!";
            else
                winner = "It's a tie!";
            ((TextView) findViewById(R.id.winner_message)).setText(winner);
            ((Button) findViewById(R.id.play_again)).setVisibility(View.VISIBLE);
        }
    }

    public void guessTwo(View view) {
        //getting guess from input
        EditText input_two = (EditText) findViewById(R.id.input_two);
        int guess = Integer.parseInt(input_two.getText().toString());
        //determines if right or wrong
        String isSame = null;
        if (guess == randomNum){
            button_two.setEnabled(false);
        }else{
            isSame = guess+" "+randomNum+" "+"Try again";
        }
        triesTwo++;
        ((TextView) findViewById(R.id.output_two)).setText(isSame);
        ((TextView) findViewById(R.id.tries_two)).setText("Tries: "+triesTwo);
        //next page if both done
        String winner = "";
        if (!button_one.isEnabled() && !button_two.isEnabled()){
            //determines winner
            if (triesTwo > triesOne)
                winner = "Player One wins!";
            else if (triesOne > triesTwo)
                winner = "Player Two wins!";
            else
                winner = "It's a tie!";
            ((TextView) findViewById(R.id.winner_message)).setText(winner);
            ((Button) findViewById(R.id.play_again)).setVisibility(View.VISIBLE);
        }
    }

    public void playAgain(View v) {
        startActivity(new Intent(Multiplayer.this, MainActivity.class));
    }

}