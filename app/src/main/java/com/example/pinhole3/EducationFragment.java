package com.example.pinhole3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class EducationFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_education, container, false);


        ImageButton blsButton = (ImageButton) root.findViewById(R.id.blsButton);
        blsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bls.gov"));
                startActivity(browserIntent);
            }
        });
        ImageButton censusButton = (ImageButton) root.findViewById(R.id.censusButton);
        censusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.census.gov/"));
                startActivity(browserIntent);
            }
        });
        ImageButton dolButton = (ImageButton) root.findViewById(R.id.dolButton);
        dolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dol.gov/"));
                startActivity(browserIntent);
            }
        });




        // go to coursera website
        ImageButton courseraButton = (ImageButton) root.findViewById(R.id.coursera_button);
        courseraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coursera.com"));
                startActivity(browserIntent);
            }
        });

        // go to edx website
        ImageButton edXButton = (ImageButton) root.findViewById(R.id.edx_button);
        edXButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.edx.com"));
                startActivity(browserIntent);
            }
        });
        // go to khan academy website
        ImageButton khanButton = (ImageButton) root.findViewById(R.id.khan_button);
        khanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.khanacademy.com"));
                startActivity(browserIntent);
            }
        });
        // go to linkedIn learning website
        ImageButton linkedinButton = (ImageButton) root.findViewById(R.id.linkedIn_button);
        linkedinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/learning/"));
                startActivity(browserIntent);
            }
        });
        // go to treehouse website
        ImageButton treehouseButton = (ImageButton) root.findViewById(R.id.treehouse_button);
        treehouseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.teamtreehouse.com"));
                startActivity(browserIntent);
            }
        });
        // go to udacity website
        ImageButton udacityButton = (ImageButton) root.findViewById(R.id.udacity_button);
        udacityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udacity.com"));
                startActivity(browserIntent);
            }
        });
        // go to udemy website
        ImageButton udemyButton = (ImageButton) root.findViewById(R.id.udemy_button);
        udemyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com"));
                startActivity(browserIntent);
            }
        });





        ImageButton sixteenButton = (ImageButton) root.findViewById(R.id.sixteen_button);
        sixteenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.16personalities.com"));
                startActivity(browserIntent);
            }
        });

        ImageButton careerButton = (ImageButton) root.findViewById(R.id.careerOneStopButton);
        careerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.careeronestop.org/Toolkit/toolkit.aspx"));
                startActivity(browserIntent);
            }
        });

        ImageButton princetonButton = (ImageButton) root.findViewById(R.id.princeton_button);
        princetonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.princetonreview.com/quiz/career-quiz"));
                startActivity(browserIntent);
            }
        });

        ImageButton workforceGPSButton = (ImageButton) root.findViewById(R.id.gpsButton);
        workforceGPSButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.workforcegps.com"));
                startActivity(browserIntent);
            }
        });


        return root;
    }
}
