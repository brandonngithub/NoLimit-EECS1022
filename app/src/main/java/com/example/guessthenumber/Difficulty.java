package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Difficulty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        configureEasyButton();
    }

    private void configureEasyButton() {
        Button easyButton = (Button) findViewById(R.id.easy);
        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Difficulty.this, MainActivity.class));
            }
        });
    }
}