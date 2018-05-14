package com.example.uuzaz.apptivestudy0513;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteTableLockedException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FriendsData data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new FriendsData("url","김태형","반갑습니당","010");

        KakaoSqliteOpenHelper mKakaoSQULiteOpenHelper = new KakaoSqliteOpenHelper (this);

        // Gets the data repository in write mode
        SQLiteDatabase db = mKakaoSQULiteOpenHelper.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values .put(FriendsData.FriendsEntry.COLUMN_NAME_MESSAGE,data.getMessage());
        values .put(FriendsData.FriendsEntry.COLUMN_NAME_NAME,data.getName());
        values .put(FriendsData.FriendsEntry.COLUMN_NAME_PHONE,data.getPhone());
        values .put(FriendsData.FriendsEntry.COLUMN_NAME_URL,data.getUrl());


// Insert the new row, returning the primary key value of the new row
        long newRowId = db.insert(FriendsData.TABLE_NAME, null, values);
        db.close();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        KakaoSqLiteOpenHelper mKakaoSQULiteOpenHelper = new KakaSQLiteOpenHelper(this);


    }
}
