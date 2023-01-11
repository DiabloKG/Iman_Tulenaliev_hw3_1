package com.example.iman_tulenaliev_hw3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity {

    AppCompatButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        findViewById();
        clickListener();
    }

    private void findViewById() {
        button = findViewById(R.id.Button_Third);
    }

    private void clickListener() {
        button.setOnClickListener(view -> {
            transition();
        });
    }

    private void transition() {
        Intent intent = new Intent(ThirdActivity.this, MainActivity.class);
        startActivity(intent);
    }
}