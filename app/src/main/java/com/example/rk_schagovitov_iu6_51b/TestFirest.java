package com.example.rk_schagovitov_iu6_51b;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TestFirest extends AppCompatActivity {

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
        setContentView(R.layout.test1);

        buttonSum = (Button) findViewById(R.id.button1);
        buttonDifference = (Button) findViewById(R.id.button2);
        buttonDivision = (Button) findViewById(R.id.button3);
        buttonMultiplication = (Button) findViewById(R.id.button4);

        buttonDifference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent = new Intent(TestFirest.this, MainActivity.class);
                    startActivity(intent); finish();

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