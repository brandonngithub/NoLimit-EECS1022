package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Difficulty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

    }

    public void easyMode(View view) {
        startActivity(new Intent(Difficulty.this, SingleplayerEasy.class));
    }

    public void normalMode(View view) {
        startActivity(new Intent(Difficulty.this, SingleplayerNormal.class));
    }

    public void hardMode(View view) {
        startActivity(new Intent(Difficulty.this, SingleplayerHard.class));
    }

}