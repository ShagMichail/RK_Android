package com.example.rk_schagovitov_iu6_51b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static int width;
    private static int height;
    private static DisplayMetrics metrics;
    Button buttonSum;
    Button buttonDifference;
    Button buttonDivision;
    Button buttonMultiplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSum = findViewById(R.id.button_s);
        buttonDifference = findViewById(R.id.button_di);
        buttonDivision = (Button) findViewById(R.id.button_du);
        buttonMultiplication = (Button) findViewById(R.id.button_mu);

        buttonDifference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, TestFirest.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {

                }
            }
        });

//        buttonDivision.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }
}