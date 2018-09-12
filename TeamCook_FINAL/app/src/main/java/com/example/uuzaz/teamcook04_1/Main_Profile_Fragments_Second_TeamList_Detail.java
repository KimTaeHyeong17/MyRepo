package com.example.uuzaz.teamcook04_1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Main_Profile_Fragments_Second_TeamList_Detail extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setContentView(R.layout.activity_main__profile__fragments__second__team_list__detail);



        findViewById(R.id.back_btn_x).setOnClickListener(this);
        findViewById(R.id.feedback_btn01).setOnClickListener(this);
        findViewById(R.id.chatting_btn01).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back_btn_x :
                this.finish();
                break;
            case R.id.feedback_btn01 :
                Intent intent = new Intent(Main_Profile_Fragments_Second_TeamList_Detail.this, Feedback.class);
                startActivity(intent);
                finish();
                break;
            case R.id.chatting_btn01 :
                Intent intent1 = new Intent(Main_Profile_Fragments_Second_TeamList_Detail.this, ChatActivity.class);
                startActivity(intent1);
                finish();
                break;
        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
