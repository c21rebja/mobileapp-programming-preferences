package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //save data to shared preferences from an edittext

    SharedPreferences prefs;
    SharedPreferences.Editor edit;

    EditText nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        prefs = getSharedPreferences("preferences", MODE_PRIVATE);
        edit = prefs.edit();

        Button saveButton = findViewById(R.id.save_button);
        nameInput = findViewById(R.id.edit_text);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.putString("name", nameInput.getText().toString());
                edit.apply();
            }
        });
    }
}