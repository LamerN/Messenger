package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMessegeActivity extends AppCompatActivity {

    private TextView textViewReceivedMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_messege);
        textViewReceivedMsg = findViewById(R.id.textViewReceivedMsg);
        Intent intent1 = getIntent();
        String msg = intent1.getStringExtra("message");
        textViewReceivedMsg.setText(msg);

    }
}