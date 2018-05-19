package com.example.uuzaz.student_management;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;

public class DBHelpter extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;

    public DBHelpter(Context context) {
        super(context, "student db", null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String studentSql = "create table tb_student (" +
                "_id integer primary key autoincrement," +
                "name not null," +
                "email" +
                "phone," +
                "phone)";

        String scoreSql = "create table tb_grade (" +
                "_id integer primary key autoincrement," +
                "student_id not null," +
                "subjetct," +
                "date," +
                "grade)";
        db.execSQL(studentSql);
        db.execSQL(scoreSql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(newVersion==DATABASE_VERSION){
            db.execSQL("drop table tb_studnet");
            db.execSQL("drop table tb_score");

        }


    }
}
