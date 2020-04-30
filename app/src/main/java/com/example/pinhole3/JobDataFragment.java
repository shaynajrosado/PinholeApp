package com.example.pinhole3;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JobDataFragment extends Fragment implements MyRecyclerViewAdapter.ItemClickListener {
    public String state;
    MyRecyclerViewAdapter adapter;
   //private DatabaseReference mDatabase;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_jobdata, container, false);

        //populate recyclerview
        ArrayList<String> jobs = new ArrayList<>();
        jobs.add("AK");
        jobs.add("AL");
        jobs.add("AR");
        jobs.add("AZ");
        jobs.add("CA");
        jobs.add("CO");
        jobs.add("CT");
        jobs.add("DC");
        jobs.add("DE");
        jobs.add("FL");
        jobs.add("GA");
        jobs.add("GU");
        jobs.add("HI");
        jobs.add("IA");
        jobs.add("ID");
        jobs.add("IL");
        jobs.add("IN");
        jobs.add("KY");
        jobs.add("LA");
        jobs.add("MA");
        jobs.add("MD");
        jobs.add("ME");
        jobs.add("MN");
        jobs.add("MO");
        jobs.add("MS");
        jobs.add("MT");
        jobs.add("MO");
        jobs.add("MS");
        jobs.add("MT");
        jobs.add("NC");
        jobs.add("NY");
        // set up the RecyclerView
        RecyclerView recyclerView = root.findViewById(R.id.jobdatalist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        adapter = new MyRecyclerViewAdapter(this.getContext(), jobs);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(),
                DividerItemDecoration.VERTICAL));

        return root;
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this.getContext(), "Showing current job postings in the state of " + adapter.getItem(position), Toast.LENGTH_SHORT).show();

        state = adapter.getItem(position);
        Intent intent = new Intent(view.getContext(),ViewJobDatabase.class );
        intent.putExtra("state_key", adapter.getItem(position));
        startActivity(intent);


    }


}