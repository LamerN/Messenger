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
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messege);
        Intent choosenIntent = Intent.createChooser(intent, getText(R.string.choose_intent));
        startActivity(choosenIntent);

    }
}