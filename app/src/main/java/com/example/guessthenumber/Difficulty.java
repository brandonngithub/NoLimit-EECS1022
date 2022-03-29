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

        configureEasyButton();
        configureNormalButton();
        configureHardButton();
    }


    private void configureEasyButton() {
        Button easyButton = (Button) findViewById(R.id.easy);
        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Difficulty.this, SingleplayerEasy.class));
            }
        });
    }
    private void configureNormalButton() {
        Button normalButton = (Button) findViewById(R.id.normal);
        normalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Difficulty.this, SingleplayerNormal.class));

            }
        });
    }
    private void configureHardButton() {
        Button hardButton = (Button) findViewById(R.id.hard);
        hardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Difficulty.this, SingleplayerHard.class));

            }

        });
    }


}