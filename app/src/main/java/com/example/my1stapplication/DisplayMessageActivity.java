package com.example.my1stapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE_VALUE_1 = "com.example.my1stapplication.VALUE_1";
    public static final String EXTRA_MESSAGE_VALUE_2 = "com.example.my1stapplication.VALUE_2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }

    public void calculateAndRedirect(final View view) {
        Intent intent = new Intent(this, DisplaySumActivity.class);
        final EditText editText1 = findViewById(R.id.editTextValue1);
        final EditText editText2 = findViewById(R.id.editTextValue2);

        final String value1 = editText1.getText().toString();
        final String value2 = editText2.getText().toString();

        intent.putExtra(EXTRA_MESSAGE_VALUE_1, value1);
        intent.putExtra(EXTRA_MESSAGE_VALUE_2, value2);

        startActivity(intent);
    }
}