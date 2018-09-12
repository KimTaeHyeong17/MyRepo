package com.example.uuzaz.teamcook04_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ContestInfoDetail extends AppCompatActivity {

    Button maketeam, searchteam;
    ImageButton btn_back;
    ImageView contestposter;
    TextView contestname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contest_info_detail);

        searchteam = (Button) findViewById(R.id.id_generate_info_detail);
        searchteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ContestInfoDetail.this, "만들어진 팀이 없습니다.", Toast.LENGTH_SHORT).show();            }
        });

        maketeam = (Button) findViewById(R.id.id_make_team_detail);
        maketeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContestInfoDetail.this, CreateTeamActivity.class);
                startActivity(intent);
                finish();

            }
        });


        btn_back = (ImageButton) findViewById(R.id.id_back02);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContestInfoDetail.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        contestposter = (ImageView) findViewById(R.id.info_picture);
        contestname = (TextView) findViewById(R.id.info_name_output);


        ImageView love_upDrawable = (ImageView) findViewById(R.id.love_up);
        TextView info_name_outputStr = (TextView) findViewById(R.id.info_name_output);
        TextView info_dateStr = (TextView) findViewById(R.id.info_date);
        TextView d_dayStr = (TextView) findViewById(R.id.d_day);

        Bundle mbundle = getIntent().getExtras();
        if (mbundle != null) {
            contestname.setText(mbundle.getString("countryname"));
            contestposter.setImageResource(mbundle.getInt("countryflag"));

        }


    }
}