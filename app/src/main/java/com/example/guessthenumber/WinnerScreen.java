package com.example.guessthenumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class WinnerScreen extends AppCompatActivity {
    Button show_file;
    TextView file_text;
    EditText username;
    Button add_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner_screen);

        show_file = (Button) findViewById(R.id.show_file);
        file_text = (TextView) findViewById(R.id.file_text);
        add_name = (Button) findViewById(R.id.add_name);
        username = (EditText) findViewById(R.id.username);
    }

    public void showFile(View view) {
        String text = "";
        try {
            InputStream is = getAssets().open("winners.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        text += "\n" + username.getText();
        file_text.setText(text);
    }

    public void addName(View view) {
        String text = "";
        try {
            InputStream is = getAssets().open("winners.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        text += "\n" + username.getText();
        file_text.setText(text);
    }

    public void playAgain(View view) {
        startActivity(new Intent(WinnerScreen.this, MainActivity.class));
    }
}