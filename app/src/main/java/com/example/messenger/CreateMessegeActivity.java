package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessegeActivity extends AppCompatActivity {

    private EditText editTextMessege;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_massage);
        editTextMessege = findViewById(R.id.editTextMessege);
    }

    public void onClickSendMessege(View view) {
        String messege = editTextMessege.getText().toString();
        Intent intent = new Intent(this, ReceivedMessegeActivity.class);
        intent.putExtra("message", messege);
        startActivity(intent);

    }
}