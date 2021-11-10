package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
private TextView textview;
private EditText mReply;
    public static final String EXTRA_REPLY =
            "com.example.android.activities.extra.REPLY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        textview = findViewById(R.id.textView);
        textview.setText(message);
        mReply = findViewById(R.id.editTextReply);
    }

    public void Reply(View view) {
        String reply = mReply.getText().toString();
        Intent intentrep = new Intent();
        intentrep.putExtra(EXTRA_REPLY,reply);
        setResult(RESULT_OK, intentrep);
        finish();
    }


}