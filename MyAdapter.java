package com.example.energyadvisors;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.backendless.rt.RTTypes.log;

public class MyAdapter extends  RecyclerView.Adapter<MyAdapter.ViewHolder>  {
    private static final String TAG = "MyAdapter";
    // Declare variables needed for the class
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mEmail = new ArrayList<>();
    private Context mContext;

    public MyAdapter(ArrayList<String> Names, ArrayList<String> Email, Context context) {
         mNames = Names;
         mEmail = Email;
         mContext = context;
    }
     

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate((R.layout.layout_listitem) , parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
         Log.d(TAG, "onBindViewHolder: called. ");
         holder.info.setText(mNames.get(position));
         

    }

    @Override
    public int getItemCount() {
        return mNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView info;
        RelativeLayout parentLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            info = itemView.findViewById(R.id.info);
            parentLayout = itemView.findViewById(R.id.parent_layout);



        }
    }
}
