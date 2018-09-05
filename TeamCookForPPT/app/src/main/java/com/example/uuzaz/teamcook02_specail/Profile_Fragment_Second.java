package com.example.uuzaz.teamcook02_specail;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Profile_Fragment_Second extends Fragment {


    public Profile_Fragment_Second() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile__fragment__second, container, false);

        EditText name = (EditText) v.findViewById(R.id.profilefragmentsecond_edittext_name);
        EditText school = (EditText) v.findViewById(R.id.profilefragmentsecond_edittext_schoolname);
        EditText major = (EditText) v.findViewById(R.id.profilefragmentsecond_edittext_major);
        EditText grade = (EditText) v.findViewById(R.id.profilefragmentsecond_edittext_grade);
        EditText specialty = (EditText) v.findViewById(R.id.profilefragmentsecond_edittext_specialty);
        EditText awards = (EditText) v.findViewById(R.id.profilefragmentsecond_edittext_awards);



        Button start = (Button) v.findViewById(R.id.id_generate);

        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);

            }
        });

        Button back = (Button) v.findViewById(R.id.id_cancel);
        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);

            }
        });
        return v;

    }
}
