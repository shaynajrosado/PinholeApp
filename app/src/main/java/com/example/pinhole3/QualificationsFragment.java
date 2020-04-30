package com.example.pinhole3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class QualificationsFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    String record,record2 = "";
    TextView textView, textView2;
    ArrayAdapter<CharSequence> adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_qualifications, container, false);

        textView = (TextView) root.findViewById(R.id.qualificationsText);
        textView2 = (TextView) root.findViewById(R.id.qualificationsText2);
        Spinner spinner = (Spinner) root.findViewById(R.id.spinner);


        adapter = ArrayAdapter.createFromResource(this.getContext(), R.array.careers_array, R.layout.spinner_item);
        spinner.setOnItemSelectedListener(this);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        return root;
    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)

        switch (pos)
        {
            case 0: // education & social services
                record = "Degree Level:\n\t- Bachelor's degree\n\t- Master's degree required for advancement\n\n";
                record2 = "Key Skills:\n\t- Strong people skills\n\t- Compassion\n\t- Organizational\n\t- Time-management\n\t- Problem-solving\n\t- Communication\n\t- Knowledge of social work and psychosocial practices";
                break;
            case 1: // arts & communications
                record = "Degree Level:\n\t- Associate's degree\n\t- Bachelor's degree\n\n";
                record2="With a major in graphic design, journalism, English, or communications those interested in a career in arts and communications can consider becoming a graphic designer, publishing editor or broadcaster.";
                break;
            case 2: // trades & transportation
                record = "Degree Level: \n\t- High School Diploma/GED\n\t- Associate's degree\n\t- Bachelor's degree\n\n";
                record2="Key Skills:\n\t- Commercial knowledge\n\t- Hands-on experience\n\t- Good communication";
                break;
            case 3: // management, business, and finance
                record = "Degree Level: \n\t- Associate's degree\n\t- Bachelor's degree\n\t- Master's degree for advancement\n\n";
                record2="Key Skills:\n\t- Problem-solving\n\t- Quantitative and statistical analysis\n\t- Microsoft Excel\n\t- Creativity\n\t- Intrapersonal communication";
                break;
            case 4: // science
                record = "Degree Level: \n\t- Bachelor's degree\n\t- Master's degree for advancement\n\n";
                record2="Key Skills:\n\t- Awareness of personal strengths/weaknesses\n\t- Scientific knowledge\n\t- Research skills\n\t- Communication\n\t- Management and leadership\n\t- Professionalism\n\t- Problem-solving\n\t- Critical thinking\n\t- Statistical and quantitative analysis";
                break;
            case 5: // hospitality, tourism, service
                record = "Degree Level: \n\t- Associate's degree\n\t- Bachelor's degree\n\n";
                record2= "Key Skills: \n\t- Customer service\n\t- Cultural awareness\n\t- Communication\n\t- Multitasking\n\t- Foreign language(s)\n\t- Teamwork";
                break;
            case 6: // legal & law enforcement
                record = "Degree Level:\n\t- High School Diploma/GED\n\t- Associate's degree\n\t- Bachelor's degree\n\t- Master's degree\t\n\n";
                record2="Key Skills: \n\t- Open-mindedness\n\t- Resilience\n\t- Assertiveness\n\t- Maturity\n\t- Ability to remain calm in challenging or dangerous situations\n\t- Good communication skills";

                break;
            default:
                record = "Error";
                break;
        }


        textView.setText(record);
        textView2.setText(record2);
        textView.setVisibility(View.VISIBLE);
        textView2.setVisibility(View.VISIBLE);
    }


    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
        textView.setVisibility(View.INVISIBLE);
    }
}
