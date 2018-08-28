package com.example.uuzaz.teamcook;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Main_Fragment_INFO extends android.support.v4.app.Fragment {

    public Main_Fragment_INFO() {

    }
    Button btn_create_team_temp;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_main__fragment__info, container, false);

        Button start = (Button) v.findViewById(R.id.btn_create_team_temp);

        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CreateTeamActivity.class);
                startActivity(intent);
            }
        });
        return v;


    }
}


