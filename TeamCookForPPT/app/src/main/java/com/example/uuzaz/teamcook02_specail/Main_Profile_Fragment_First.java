package com.example.uuzaz.teamcook02_specail;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Main_Profile_Fragment_First extends Fragment {

    TextView name,school,major,grade,specialty,awards;
    String namestr;


    public Main_Profile_Fragment_First() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main__profile__fragment__first, null);
        name = (TextView) view.findViewById(R.id.mainprofilefragmentfirst_textview_name);
        school = (TextView) view.findViewById(R.id.mainprofilefragmentfirst_textview_schoolname);
        major = (TextView) view.findViewById(R.id.mainprofilefragmentfirst_textview_major);
        grade = (TextView) view.findViewById(R.id.mainprofilefragmentfirst_textview_grade);
        specialty = (TextView) view.findViewById(R.id.mainprofilefragmentfirst_textview_specialty);
        awards = (TextView) view.findViewById(R.id.mainprofilefragmentfirst_textview_awards);

        return view;
    }
}
