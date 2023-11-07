package com.example.mavenproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.example.maven_central_demo.MathUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MathUtils.factorial(10);

    }
}