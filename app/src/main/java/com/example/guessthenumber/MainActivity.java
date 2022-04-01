package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void singleplayerMode(View view) {
        startActivity(new Intent(MainActivity.this, Difficulty.class));
    }

    public void multiplayerMode(View view) {
        startActivity(new Intent(MainActivity.this, Multiplayer.class));
    }

}