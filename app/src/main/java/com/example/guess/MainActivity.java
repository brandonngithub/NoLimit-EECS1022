package com.example.guess;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View v) {
        EditText weightView = (EditText) findViewById(R.id.weightBox);
        String wS = weightView.getText().toString();
        EditText heightView = (EditText) findViewById(R.id.heightBox);
        String hS = heightView.getText().toString();

        double wD = Model.toDouble(wS);
        double hD = Model.toDouble(hS);
        double bmiD = Model.getBMI(wD, hD);
        String bmiS = Model.formatBMI(bmiD);
        ((TextView) findViewById(R.id.BMI)).setText(bmiS);
    }
}