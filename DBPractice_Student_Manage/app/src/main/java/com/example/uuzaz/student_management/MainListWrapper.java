package com.example.uuzaz.student_management;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainListWrapper {
    public ImageView studentImageView;
    public TextView nameView;
    public ImageView contactView;

    public MainListWrapper(View root) {
        studentImageView=(ImageView)root.findViewById(R.id.main_item_student_image);
        nameView=(TextView)root.findViewById(R.id.main_item_name);
        contactView=(ImageView)root.findViewById(R.id.main_item_contact);

    }

}
