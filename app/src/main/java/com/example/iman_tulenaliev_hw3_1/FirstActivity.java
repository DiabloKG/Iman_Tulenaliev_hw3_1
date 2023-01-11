package com.example.iman_tulenaliev_hw3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    AppCompatButton button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        findViewById();
        clickListener();
    }

    private void findViewById() {
        button = findViewById(R.id.Button_firstActivity);
        editText = findViewById(R.id.Edit_Text_First);
    }

    private void clickListener() {
        button.setOnClickListener(view -> {
            Transition();
        });
    }

    private void Transition() {
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        intent.putExtra("name", editText.getText().toString());
        startActivity(intent);
    }
}