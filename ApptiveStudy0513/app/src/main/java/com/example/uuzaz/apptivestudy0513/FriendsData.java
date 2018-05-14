package com.example.uuzaz.apptivestudy0513;

import android.provider.BaseColumns;

public class FriendsData {
    private String url;
    private String name;
    private String message;
    private String phone;

    FriendsData(String url ,String name , String message,String phone){
        this.url=url;
        this.name=name;
        this.message=message;
        this.phone=phone;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getUrl() {
        return url;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /* Inner class that defines the table contents */
    public static class FriendsEntry implements BaseColumns {
        public static final String TABLE_NAME = "friends_list";
        public static final String COLUMN_NAME_URL = "url";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_MESSAGE = "message";
        public static final String COLUMN_NAME_PHONE = "phone";
    }

}
