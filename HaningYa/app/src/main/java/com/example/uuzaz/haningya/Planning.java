package com.example.uuzaz.haningya;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Planning extends AppCompatActivity {

    SQLiteDatabase db;
    MySQLiteOpenHelper helper;
    Button btnInsert;


    EditText editText_1, editText_2,editText_3,editText_4,editText_5,editText_6,editText_7,editText_8,editText_9,editText_10,editText_11,editText_12,
            editText_13,editText_14,editText_15,editText_16,editText_17,editText_18,editText_19,editText_20,editText_21,editText_22,editText_23,editText_24;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planning);


        editText_1 = (EditText) findViewById(R.id.editText_1);
        editText_2 = (EditText) findViewById(R.id.editText_2);
        editText_3 = (EditText) findViewById(R.id.editText_3);
        editText_4 = (EditText) findViewById(R.id.editText_4);
        editText_5 = (EditText) findViewById(R.id.editText_5);
        editText_6 = (EditText) findViewById(R.id.editText_6);
        editText_7 = (EditText) findViewById(R.id.editText_7);
        editText_8 = (EditText) findViewById(R.id.editText_8);
        editText_9 = (EditText) findViewById(R.id.editText_9);
        editText_10 = (EditText) findViewById(R.id.editText_10);
        editText_11 = (EditText) findViewById(R.id.editText_11);
        editText_12 = (EditText) findViewById(R.id.editText_12);
        editText_13 = (EditText) findViewById(R.id.editText_13);
        editText_14 = (EditText) findViewById(R.id.editText_14);
        editText_15 = (EditText) findViewById(R.id.editText_15);
        editText_16 = (EditText) findViewById(R.id.editText_16);
        editText_17 = (EditText) findViewById(R.id.editText_17);
        editText_18 = (EditText) findViewById(R.id.editText_18);
        editText_19 = (EditText) findViewById(R.id.editText_19);
        editText_20 = (EditText) findViewById(R.id.editText_20);
        editText_21 = (EditText) findViewById(R.id.editText_21);
        editText_22 = (EditText) findViewById(R.id.editText_22);
        editText_23 = (EditText) findViewById(R.id.editText_23);
        editText_24 = (EditText) findViewById(R.id.editText_24);



        btnInsert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //입력 버튼 리스너
                Toast.makeText(getApplicationContext(), "입력됨",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }/**end of oncreate **/

    // insert

    public void insert(String name, int age, String address) {
        db = helper.getWritableDatabase(); // db 객체를 얻어온다. 쓰기 가능
        ContentValues values = new ContentValues();
        // db.insert의 매개변수인 values가 ContentValues 변수이므로 그에 맞춤
        // 데이터의 삽입은 put을 이용한다.
        values.put("name", name);
        values.put("age", age);
        values.put("address", address);
        db.insert("student", null, values); // 테이블/널컬럼핵/데이터(널컬럼핵=디폴트)
        // tip : 마우스를 db.insert에 올려보면 매개변수가 어떤 것이 와야 하는지 알 수 있다.

    }

    // select

    public void select() {



        // 1) db의 데이터를 읽어와서, 2) 결과 저장, 3)해당 데이터를 꺼내 사용



        db = helper.getReadableDatabase(); // db객체를 얻어온다. 읽기 전용

        Cursor c = db.query("student", null, null, null, null, null, null);



        /*

         * 위 결과는 select * from student 가 된다. Cursor는 DB결과를 저장한다. public Cursor

         * query (String table, String[] columns, String selection, String[]

         * selectionArgs, String groupBy, String having, String orderBy)

         */



        while (c.moveToNext()) {

            // c의 int가져와라 ( c의 컬럼 중 id) 인 것의 형태이다.

            int _id = c.getInt(c.getColumnIndex("_id"));

            String name = c.getString(c.getColumnIndex("name"));

            int age = c.getInt(c.getColumnIndex("age"));

            String address = c.getString(c.getColumnIndex("address"));

            Log.i("db", "id: " + _id + ", name : " + name + ", age : " + age

                    + ", address : " + address);

        }

    }

}

