package com.example.iman_tulenaliev_hw3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    AppCompatButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
        clickListener();
    }

    private void findViewById() {
        button = findViewById(R.id.Button_Main);
    }

    private void clickListener() {
        button.setOnClickListener(view -> {
            Transition();
        });
    }

    private void Transition() {
        Intent intent = new Intent(MainActivity.this, FirstActivity.class);
        startActivity(intent);
    }

}