package com.example.uuzaz.student_management;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudentActivity extends AppCompatActivity implements View.OnClickListener{
    EditText nameView;
    EditText emailView;
    EditText phoneView;
    Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        nameView=(EditText)findViewById(R.id.add_name);
        emailView=(EditText)findViewById(R.id.add_email);
        phoneView=(EditText)findViewById(R.id.add_phone);
        addBtn=(Button)findViewById(R.id.add_btn);

        addBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String name = nameView.getText().toString();
        String email = emailView.getText().toString();
        String phone = phoneView.getText().toString();

        if(name==null || name.equals("")){
            Toast t = Toast.makeText(this, R.string.add_name_null, Toast.LENGTH_SHORT);
            t.show();
        }else {
            DBHelpter helper = new DBHelpter(this);
            SQLiteDatabase db = helper.getWritableDatabase();
            db.execSQL("insert into tb_student (name, email, phone) values(?,?,?)",
                    new String[] {name,email,phone});
            db.close();

            finish();

        }

    }
}
