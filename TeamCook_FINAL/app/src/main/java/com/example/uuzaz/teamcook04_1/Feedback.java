package com.example.uuzaz.teamcook04_1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Feedback extends AppCompatActivity {

    Button btn_feedback_good,btn_feedback_bad;
    ImageButton btn_back;
    ImageView contestposter;
    TextView contestname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);


        btn_back = (ImageButton) findViewById(R.id.btn_back_main_profile_fragment_second);
        btn_feedback_good = (Button) findViewById(R.id.feedback_finish_good_btn);
        btn_feedback_bad = (Button) findViewById(R.id.feedback_finish_bad_btn);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Feedback.this, Main_Profile_Fragments_Second_TeamList_Detail.class);
                startActivity(intent);
                finish();
            }
        });
        btn_feedback_good.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Feedback.this, Main_Profile_Fragments_Second_TeamList_Detail.class);
                startActivity(intent);
                finish();
            }
        });
        btn_feedback_bad.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Feedback.this, Main_Profile_Fragments_Second_TeamList_Detail.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
