package com.example.guessthenumber;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WinnerScreen extends AppCompatActivity {
    Button show_file;
    TextView file_text;

    EditText username;
    EditText password;
    Button add_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner_screen);

        show_file = (Button) findViewById(R.id.show_file);
        file_text = (TextView) findViewById(R.id.file_text);
        show_file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
                file_text.setText(text);
            }
        });

        add_name = (Button) findViewById(R.id.add_name);
        username = (EditText) findViewById(R.id.username);
        add_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "Jacob";
                try {
                    FileOutputStream os = new FileOutputStream("winners.txt");
                    os.write(text.getBytes());
                    os.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
//            requestPermissions(new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
//        }
//        username = (EditText) findViewById(R.id.username);
//        password = (EditText) findViewById(R.id.password);
//        add_name = (Button) findViewById(R.id.add_name);
//        add_name.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String user = username.getText().toString();
//                String pass = password.getText().toString();
//                saveTextAsFile(user, pass);
//            }
//        });
    }

//    private void saveTextAsFile(String filename, String content) {
//        String fileName = filename + ".txt";
//        //create file
//        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), fileName);
//        //write to file
//        try {
//            FileOutputStream fos = new FileOutputStream(file);
//            fos.write(content.getBytes());
//            fos.close();
//            Toast.makeText(this, "Saved!", Toast.LENGTH_SHORT).show();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//            Toast.makeText(this, "Error saving!", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        switch (requestCode) {
//            case 1000:
//                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                    Toast.makeText(this, "Permissions granted!", Toast.LENGTH_SHORT).show();
//                } else {
//                    Toast.makeText(this, "Permission not granted!", Toast.LENGTH_SHORT).show();
//                    finish();
//                }
//        }
//    }

}