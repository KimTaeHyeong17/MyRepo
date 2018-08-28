package com.example.uuzaz.teamcook;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainProfileActivity extends AppCompatActivity {
    Button btn_chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_profile);

        btn_chat = (Button) findViewById(R.id.id_chat);
        btn_chat.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainProfileActivity.this, ChatActivity.class);
                startActivity(intent);
            }
        });

    }
}
