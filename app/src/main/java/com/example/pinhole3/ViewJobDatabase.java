package com.example.pinhole3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ViewJobDatabase extends AppCompatActivity {

   //private static final String TAG = "ViewJobDatabase";
   private String stateId;
   private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_database_layout);

        Intent intent =getIntent();
        stateId = intent.getStringExtra("state_key");
        try {


        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_jobs);
        new FirebaseDatabaseHelper().readAllStates(stateId, new FirebaseDatabaseHelper.DataStatus() {
            @Override
            public void DataIsLoaded(List<JobDTO> jobs, List<String> keys) {
                new RecyclerView_Config().setConfig(mRecyclerView,ViewJobDatabase.this,jobs, keys);
            }

            @Override
            public void DataIsInserted() {

            }

            @Override
            public void DataIsUpdated() {

            }

            @Override
            public void DataIsDeleted() {

            }
        });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
