package com.example.my1stapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplaySumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_sum);

        final Intent intent = getIntent();
        final String stringValue1 = intent.getStringExtra(DisplayMessageActivity.EXTRA_MESSAGE_VALUE_1);
        final String stringValue2 = intent.getStringExtra(DisplayMessageActivity.EXTRA_MESSAGE_VALUE_2);

        TextView textView = findViewById(R.id.textViewSumValue);

        String message = "";

        try {
            final Integer value1 = Integer.valueOf(stringValue1);
            final Integer value2 = Integer.valueOf(stringValue2);

            final Integer result = value1 + value2;

            message = "O resultado da soma é: " + result;
        } catch (final Exception exception) {
            message = "Ocorreu um erro, insira números inteiros válidos!";
            System.out.println("Error occurred: " + exception.getMessage());
        }

        textView.setText(message);

    }

}