package com.example.energyadvisors;

import android.content.Intent;
import android.os.Bundle;

import com.backendless.Backendless;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Result extends AppCompatActivity {

//    private RecyclerView recyclerView;
//    private RecyclerView.Adapter mAdapter;
//    private RecyclerView.LayoutManager layoutManager;
//    private static final String TAG = "Result";
    // vars
//    private ArrayList<String> mNames = new ArrayList<>();
//    private ArrayList<String> mEmails = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
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


        contactList current = new contactList();
        ArrayList<Contacts> listo = current.getArrays();
        ArrayList<Contacts> finals = new ArrayList<Contacts>();
        Intent in = getIntent();
        String problem = in.getStringExtra("hello");
        for (int i = 0; i < listo.size(); i++) {
            if (listo.get(i).getArea_Of_Specialty().equals(problem)) {
                finals.add(listo.get(i));
            }
        }
        String output = " ";
        if (finals.size() == 0) {
            output = "There are no energy advisors in that area currently. Call company help line.";
        } else {
            for (int i = 0; i > finals.size(); i++) {
                output = output + "\n" + finals.get(i).getFirst_Name() + " " + finals.get(i).getLast_Name() + "\n" + "Email: " + finals.get(i).getEmail() + "\n" + "Phone number: " + finals.get(i).getEmail() + "\n" + " ";
            }
        TextView texty = findViewById(R.id.textView3);
        texty.setText(output);



            // String [] fullName = intent.getStringArrayExtra(name);
//        //String desire = intent.getStringExtra("desire");
//       // String business = intent.getStringExtra("buis");
//       // String consumer = intent.getStringExtra("con");
//       String desire = "Efficiency";
//       String business = "1";
//       String consumer = "0";
//
//        // Interates through the list and sees which ones match the intention.
//        // Potential canidates are added to an arraylist
//        ArrayList<Contacts> desires = new ArrayList<Contacts>();
//        for (int i=0; i < result.size(); i++) {
//            if(result.get(i).getArea_Of_Specialty().equals(desire)) {
//                desires.add(result.get(i));
//            }
//        }
//        ArrayList<Contacts> finals = new ArrayList<Contacts>();
//        for (int i=0; i < desires.size(); i++) {
//            if((desires.get(i).getBusiness()  != Integer.parseInt(business)) && (desires.get(i).getConsumer()  != Integer.parseInt(consumer)))  {
//                desires.remove(result.get(i));
//            }
//        }
//        for(int i=0; i < finals.size(); i++) {
//                mNames.add(finals.get(i).getFirst_Name() + " " + finals.get(i).getLast_Name());
//                mEmails.add(finals.get(i).getEmail());
//            }
//         initRecyclerView();
//
//
//
//        }
//        private void initRecyclerView() {
//            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle);
//            MyAdapter adapter = new MyAdapter(mNames,mEmails, this );
//            recyclerView.setAdapter(adapter);
//            recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        }


            // Creates the recycler view

            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            //recyclerView.setHasFixedSize(true);
            // use a linear layout manager
            //layoutManager = new LinearLayoutManager(this);
            // recyclerView.setLayoutManager(layoutManager);

            // specify an adapter (see also next example)
            // mAdapter = new MyAdapter(myDataset);
            //recyclerView.setAdapter(mAdapter);


        }
    }
}


