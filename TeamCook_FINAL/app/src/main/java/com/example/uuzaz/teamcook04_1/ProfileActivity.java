package com.example.uuzaz.teamcook04_1;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.iid.FirebaseInstanceId;

public class ProfileActivity extends AppCompatActivity {

    EditText name, school, major, grade, specialty, awards;
    Button start;
    DatabaseReference databaseReference;
    String token = FirebaseInstanceId.getInstance().getToken();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name = (EditText) findViewById(R.id.profilefragmentsecond_edittext_name);
        school = (EditText) findViewById(R.id.profilefragmentsecond_edittext_schoolname);
        major = (EditText) findViewById(R.id.profilefragmentsecond_edittext_major);
        grade = (EditText) findViewById(R.id.profilefragmentsecond_edittext_grade);
        specialty = (EditText) findViewById(R.id.profilefragmentsecond_edittext_specialty);
        awards = (EditText) findViewById(R.id.profilefragmentsecond_edittext_awards);

        databaseReference = FirebaseDatabase.getInstance().getReference("users");

        start = (Button) findViewById(R.id.id_generate);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                writeNewUser(token, name.getText().toString(), school.getText().toString(),
                        major.getText().toString(), grade.getText().toString(),
                        specialty.getText().toString(),
                        awards.getText().toString());
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });


        Button back = (Button) findViewById(R.id.id_cancel);
        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });


    }

    /**
     * end of oncreate
     **/
    private void writeNewUser(String userId, String name, String school, String major, String grade, String specialty, String awards) {
        User user = new User(name, school, major, grade, specialty, awards);
        databaseReference.child(userId).child("name").setValue(name);
        databaseReference.child(userId).child("school").setValue(school);
        databaseReference.child(userId).child("major").setValue(major);
        databaseReference.child(userId).child("grade").setValue(grade);
        databaseReference.child(userId).child("major").setValue(specialty);
        databaseReference.child(userId).child("awards").setValue(awards);

    }

}


