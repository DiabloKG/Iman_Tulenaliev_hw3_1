package com.example.iman_tulenaliev_hw3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    AppCompatButton button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViewById();
        setText();
        clickListener();
    }

    private void findViewById() {
        button = findViewById(R.id.Button_Second);
        textView = findViewById(R.id.Text_View);
    }

    private void clickListener() {
        button.setOnClickListener(view -> {
            Transition();
        });
    }

    private void setText() {
        String nameFromActivity = getIntent().getStringExtra("name");
        textView.setText("Hello " + nameFromActivity);
    }

    private void Transition() {
        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        startActivity(intent);
    }
}