package com.example.uuzaz.student_management;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button testBtn;
    FloatingActionButton addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  testBtn=(Button)findViewById(R.id.main_test_btn);
        addBtn=(FloatingActionButton)findViewById(R.id.fab);

      //  testBtn.setOnClickListener(this);
        addBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==addBtn){
            Intent intent = new Intent(this, AddStudentActivity.class);
            startActivity(intent);
        }else if(v==testBtn) {
            Intent intent = new Intent(this,ReadStudentActivity.class);
            startActivity(intent);
        }


    }
}
