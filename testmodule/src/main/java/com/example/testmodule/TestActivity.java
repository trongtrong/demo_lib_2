package com.example.testmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Intent intent = getIntent();
        String test = intent.getStringExtra("'data");
        Log.d("TestActivity", "onCreate:  " +test);

        int a = 10;
        int b = 20;

        if (a > b){
            b = 30;
        }else {
            a = 20;
        }
    }
}