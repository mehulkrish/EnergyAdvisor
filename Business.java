package com.example.energyadvisors;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Business extends AppCompatActivity {

    private static final String TAG = Business.class.getSimpleName();
    public Intention aim;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);
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

        // Set up the buttons
        Button efficiency  = findViewById(R.id.Efficiency);
        efficiency.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:
                String problem = "Efficiency";
                aim = new Intention(problem, 1, 0);

                Log.d(TAG, "onClick: hello ");
                Intent intent = new Intent(Business.this, Result.class);
                intent.putExtra("hello", aim.getDesire());
                

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        Button opto  = findViewById(R.id.Cost_Optimization);
        opto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:
                String problem = "Cost Optimization";
                aim = new Intention(problem, 1, 0);
                Intent intent = new Intent(Business.this, Result.class);
                intent.putExtra("hello", aim.getDesire());


                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        Button EM  = findViewById(R.id.EM);
        EM.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:
                String problem = "Energy Management";
                aim = new Intention(problem, 1, 0);
                Intent intent = new Intent(Business.this, Result.class);
                intent.putExtra("hello", aim.getDesire());


                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        Button carbon  = findViewById(R.id.carbonfoot);
        carbon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:
                String problem = "Carbon Footprint Management";
                aim = new Intention(problem, 1, 0);
                Intent intent = new Intent(Business.this, Result.class);
                intent.putExtra("hello", aim.getDesire());


                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        Button renewable  = findViewById(R.id.Renewable);
        renewable.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:
                String problem = "Renewable";
                aim = new Intention(problem, 1, 0);
                Intent intent = new Intent(Business.this, Result.class);
                intent.putExtra("hello", aim.getDesire());


                // start the activity connect to the specified class
                startActivity(intent);
            }
        });


        Button infra  = findViewById(R.id.infra);
        infra.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:
                String problem = "Infrastructure Repair";
                aim = new Intention(problem, 1, 0);
                Intent intent = new Intent(Business.this, Result.class);
                intent.putExtra("hello", aim.getDesire());

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        Button other  = findViewById(R.id.Other);
        infra.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:
                String problem = "Other";
                aim = new Intention(problem, 1, 0);
                Intent intent = new Intent(Business.this, Result.class);
                intent.putExtra("hello", aim.getDesire());




                // start the activity connect to the specified class
                startActivity(intent);
            }
        });




    }

}
