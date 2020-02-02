package com.example.energyadvisors;

import android.content.Intent;
import android.os.Bundle;

import com.backendless.Backendless;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public static final String APP_ID = "E39C24CE-D1A2-9DAD-FF60-1237E71FCC00";
    public static final String SECRET_KEY = "F907ACBE-F254-466B-A6AA-D24A6F240D10";
    public static final String VERSION = "v5.7.1";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        // This create the start button, and hopefully allows the user to switch screens
        Button start = findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called SecondActivity with the following code:

                Intent intent = new Intent(MainActivity.this, SelectionMenu.class);
                startActivity(intent);


                // start the activity connect to the specified class


            }
        });


        //Backendless trial :(
       // Backendless.initApp(this, APP_ID, SECRET_KEY);
//               //Gets the contact info from backendless
//        List<Contacts> result = Backendless.Data.of(Contacts.class).find();
//        Intent intent2 = new Intent(MainActivity.this, Result.class);
//        String[] name = new String[result.size()];
//        for(int i = 0; i > name.length; i++) {
//            name[i] = result.get(i).getFirst_Name() + " " + result.get(i).getLast_Name();
//        }
//        intent2.putExtra("name", name);
//        startActivity(intent2);





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
