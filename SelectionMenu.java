package com.example.energyadvisors;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SelectionMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_menu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // This create the business button, and hopefully allows the user to switch to business-oriented energy issues
        Button buiz = findViewById(R.id.company);
        buiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:
                Intent intent3 = new Intent(SelectionMenu.this, Business.class);

                // start the activity connect to the specified class
                startActivity(intent3);
            }
        });

        // This create the business button, and hopefully allows the user to switch to business-oriented energy issues
        Button business = findViewById(R.id.company);
        business.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:
                Intent intent3 = new Intent(SelectionMenu.this, Business.class);

                // start the activity connect to the specified class
                startActivity(intent3);
            }
        });
        // This create the home user button, and hopefully allows the user to switch to consumer energy issues
        Button home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:
                Intent intent = new Intent(SelectionMenu.this, Business.class);
                Log.i("INTENT", "clicked home listener");
                // start the activity connect to the specified class
                startActivity(intent);
            }
        });
    }

}
