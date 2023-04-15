package com.example.library_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toasty.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.simpleToast(this,"This is my toast");

    }
}