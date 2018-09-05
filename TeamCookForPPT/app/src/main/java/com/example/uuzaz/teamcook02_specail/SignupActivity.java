package com.example.uuzaz.teamcook02_specail;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SignupActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    Button signup;
    String emailstr, passwordstr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        email = (EditText) findViewById(R.id.signupactivity_edittext_email);
        password = (EditText) findViewById(R.id.signupactivity_edittext_password);
        signup = (Button) findViewById(R.id.signupactivity_button_signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (email.getText().toString() == null || password.getText().toString() == null) {
                    return;
                }

                emailstr = email.getText().toString();
                passwordstr = password.getText().toString();
                if (emailstr.contains("@pusan.ac.kr")) {

                    Toast.makeText(SignupActivity.this, "성공", Toast.LENGTH_SHORT).show();
                    /*FirebaseAuth.getInstance()
                            .createUserWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                            .addOnCompleteListener(SignupActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    startActivity(new Intent(SignupActivity.this, LoginActivity.class));
                                }
                            }); */
                    startActivity(new Intent(SignupActivity.this, LoginActivity.class));
                    finish();


                } else {
                    Toast.makeText(SignupActivity.this, "잘못된 이메일 형식입니다", Toast.LENGTH_SHORT).show();
                }







            }/** onclick **/
        });/**onclicklistener**/

    }/**on create **/

}
