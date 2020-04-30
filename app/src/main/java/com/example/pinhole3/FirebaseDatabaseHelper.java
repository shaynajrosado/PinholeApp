package com.example.pinhole3;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

public class FirebaseDatabaseHelper {
    private FirebaseDatabase mDatabase;
    private DatabaseReference mReferenceJobs;
    private List<JobDTO> jobs = new ArrayList<>();

    public interface DataStatus{
        void DataIsLoaded(List<JobDTO> jobs, List<String> keys);
        void DataIsInserted();
        void DataIsUpdated();
        void DataIsDeleted();

    }
    public FirebaseDatabaseHelper() {
        mDatabase = FirebaseDatabase.getInstance();
        mReferenceJobs = mDatabase.getReference();

        String child = mReferenceJobs.getKey();
    }

    public void readAllStates(String stateId, final DataStatus dataStatus) {
        try {
            mReferenceJobs.child(stateId).addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    jobs.clear();
                    List<String> keys = new ArrayList<>();
                    for (DataSnapshot keyNode : dataSnapshot.getChildren()) {
                        keys.add(keyNode.getKey());
                        JobDTO job = keyNode.getValue(JobDTO.class);
                        jobs.add(job);
                    }
                    dataStatus.DataIsLoaded(jobs, keys);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
