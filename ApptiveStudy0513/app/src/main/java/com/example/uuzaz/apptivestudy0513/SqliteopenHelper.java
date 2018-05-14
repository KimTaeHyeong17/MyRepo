package com.example.uuzaz.apptivestudy0513;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;


public class SqliteopenHelper extends SQLiteOpenHelper {
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE" +
                    FriendsData.FriendsEntry.TABLE_NAME + "(" +
                    FriendsData.FriendsEntry._ID + "INTEGER PRIMARY KEY"+
                    FriendsData.FriendsEntry.COLUMN_NAME_NAME + "TEXT"+"" +
                    FriendsData.FriendsEntry.COLUMN_NAME_MESSAGE + "TEXT"+
                    FriendsData.FriendsEntry.COLUMN_NAME_PHONE + "TEXT"+
                    FriendsData.FriendsEntry.COLUMN_NAME_URL+ "TEXT";

private static final String SQU_DELETE_ENTRIES =
        "DROP TABLE IF EXISTS" + FriendsData.FriendsEntry.TABLE_NAME;

public static final int DATABASE_VERSION = 1;
public static final String DATABASE_NAME="kakao.db";

public SqliteopenHelper(Context context) {
    super( context,DATABASE_NAME,null,DATABASE_VERSION);
}
//japsjfpajgjra gprajiadj'ig ha
    pighreapihpivjs

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(SQL_CREATE_ENTRIES);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL(SQU_DELETE_ENTRIES);
    onCreate(db);
    }

    public void  OnDowngrade(SQLiteDatabase db, int oldVersion, int newVersion){
    onUpgrade(db,oldVersion,newVersion);

    public ArrayList

    }
}
