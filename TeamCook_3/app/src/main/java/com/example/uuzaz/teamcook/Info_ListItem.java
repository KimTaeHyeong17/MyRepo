package com.example.uuzaz.teamcook;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Info_ListItem {
    private Drawable iconDrawable;
    private String titleStr;
    private String d_dayStr;
    private String the_dayStr;

    public void setIcon(Drawable icon) {
        iconDrawable = icon;
    }

    public void setThe_day(String the_day) {
        the_dayStr = the_day;
    }

    public void setD_day(String d_day) {
        d_dayStr = d_day;
    }

    public void setTitle(String title) {
        titleStr = title;
    }



    public Drawable getIcon() {
        return this.iconDrawable;
    }

    public String getThe_day() {
        return this.the_dayStr;
    }

    public String getD_day() {
        return this.d_dayStr;
    }

    public String getTitle() {
        return this.titleStr;
    }
}
