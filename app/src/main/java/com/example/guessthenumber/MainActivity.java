package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureSingleplayerButton();
    }

    private void configureSingleplayerButton() {
        Button easyButton = (Button) findViewById(R.id.singleplayer);
        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Difficulty.class));
            }
        });
    }

    public void buttonClicked(View v) {
        EditText inputBox = (EditText) findViewById(R.id.input);
        String str = inputBox.getText().toString();

        int guess = Integer.parseInt(str);
        int randomNum = (int) Math.floor(Math.random()*(10)+1);
        String isSame = guess+" "+randomNum+" "+"wrong";
        if (guess == randomNum)
            isSame = guess+" "+randomNum+" "+"right";;
        ((TextView) findViewById(R.id.output)).setText(isSame);
    }
}