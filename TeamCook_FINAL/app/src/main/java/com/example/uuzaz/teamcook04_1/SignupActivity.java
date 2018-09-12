package com.example.uuzaz.teamcook04_1;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class SignupActivity extends AppCompatActivity {

    private EditText email_join;
    private EditText pwd_join;
    private Button signup;
    String emailstr, passwordstr;
    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        email_join = (EditText) findViewById(R.id.signupactivity_edittext_email);
        pwd_join = (EditText) findViewById(R.id.signupactivity_edittext_password);
        signup = (Button) findViewById(R.id.signupactivity_button_signup);

        firebaseAuth = FirebaseAuth.getInstance();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = email_join.getText().toString().trim();
                String pwd = pwd_join.getText().toString().trim();

                if (email.contains("pusan.ac.kr")) {
                    firebaseAuth.createUserWithEmailAndPassword(email, pwd)
                            .addOnCompleteListener(SignupActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        Toast.makeText(SignupActivity.this, "정상 등록 되었습니다.", Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                                        startActivity(intent);
                                        finish();
                                    } else {
                                        Toast.makeText(SignupActivity.this, "등록에러", Toast.LENGTH_SHORT).show();
                                        return;
                                    }

                                }
                            });
                } else {
                    Toast.makeText(SignupActivity.this, "학교 웹메일을 사용해주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }


            }/** onclick **/
        });/**onclicklistener**/

    }/**on create **/

}
