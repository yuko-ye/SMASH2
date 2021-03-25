package com.example.smash2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton mcameraButton;
    ImageButton mhistoryButton;
    ImageButton msettingsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}