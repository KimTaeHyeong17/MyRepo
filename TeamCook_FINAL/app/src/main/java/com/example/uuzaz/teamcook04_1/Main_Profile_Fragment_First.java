package com.example.uuzaz.teamcook04_1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.service.autofill.Dataset;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.iid.FirebaseInstanceId;


public class Main_Profile_Fragment_First extends Fragment {

    TextView name, school, major, grade, specialty, awards;
    String namestr, schoolstr, majorstr, gradestr, specialtystr, awardsstr;
    DatabaseReference databaseReference;


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

        String token = FirebaseInstanceId.getInstance().getToken();


        databaseReference = FirebaseDatabase.getInstance().getReference("users");
        databaseReference.child(token)
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User user = dataSnapshot.getValue(User.class);
                        name.setText(user.name);
                        school.setText(user.school);
                        major.setText(user.major);
                        grade.setText(user.grade);
                        specialty.setText(user.specialty);
                        awards.setText(user.awards);
                    }
                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
        return view;
    }
}
