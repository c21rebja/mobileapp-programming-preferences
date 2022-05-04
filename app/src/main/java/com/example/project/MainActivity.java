package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    //TextView viewName;
    //EditText nameInput;

    SharedPreferences prefs;
    SharedPreferences.Editor edit;

    //private Button saveButton;

    private Button startActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        startActivity = findViewById(R.id.second_activity_button);

        startActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        /*
        viewName = findViewById(R.id.print_view);

        prefs = getSharedPreferences("preferences", MODE_PRIVATE);
        edit = prefs.edit();

        //edit.putString("name", "Rebecka"); //lägger in namn (finns alltid kvar även om raden tas bort) tills vi tar bort det
        //edit.apply(); //apply changes

        saveButton = findViewById(R.id.save_button);
        nameInput = findViewById(R.id.edit_text);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.putString("name", nameInput.getText().toString());
                edit.apply();
            }
        });
         */
    }

    @Override
    protected void onResume() {
        super.onResume();

        // read data from shared preferences and update text

        /*
        //uppdaterar namnet varje resume
        prefs = getSharedPreferences("preferences", MODE_PRIVATE);
        String name = prefs.getString("name", "No name found.");
        if(viewName != null) {
            viewName.setText(name); //sätt det sparade namnet i en textview
        }
        else {
            Log.d("===", "viewName was empty");

        }
         */
    }
}
