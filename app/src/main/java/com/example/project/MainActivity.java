package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    TextView viewName;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewName = findViewById(R.id.nameText);

        prefs = getSharedPreferences("preferences", MODE_PRIVATE);
        SharedPreferences.Editor edit = prefs.edit();
        edit.putString("name", "Rebecka"); //lägger in namn (finns alltid kvar även om raden tas bort) tills vi tar bort det
        edit.apply(); //apply changes
    }

    @Override
    protected void onResume() {
        super.onResume();

        //uppdaterar namnet varje resume
        prefs = getSharedPreferences("preferences", MODE_PRIVATE);
        String name = prefs.getString("name", "No name found.");
        viewName.setText(name); //sätt det sparade namnet i en textview

        //SharedPreferences.Editor edit = prefs.edit();
    }
}
