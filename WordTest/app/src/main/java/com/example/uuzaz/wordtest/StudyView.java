package com.example.uuzaz.wordtest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

MyDBHelper m_helper;
m_helper=new DBHelper(mContext,"test.db",null,1);

public class StudyView extends SQLiteOpenHelper{
    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context,name,factory,version);
    }
}
