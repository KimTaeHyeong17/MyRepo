package com.example.uuzaz.teamcook;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Info_ListViewAdapter extends BaseAdapter {
    private ArrayList<Info_ListItem> listViewItemList = new ArrayList<Info_ListItem>() ;

    // ListViewAdapter의 생성자
    public Info_ListViewAdapter() {
    }

    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    @Override
    public int getCount() {
        return listViewItemList.size() ;
    }

    // position에 위치한 데이터를 화면에 출력하는데 사용될 View를 리턴. : 필수 구현
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        // "listview_item" Layout을 inflate하여 convertView 참조 획득.
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listitem_info, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        //ImageButton i_btn01ImageButton = (ImageButton) convertView.findViewById(R.id.info_picture_s) ;
        ImageView iconImageView = (ImageView) convertView.findViewById(R.id.info_picture_s) ;
        TextView the_dayTextView = (TextView) convertView.findViewById(R.id.info_date) ;
        TextView d_dayTextView = (TextView) convertView.findViewById(R.id.d_day) ;
        TextView titleTextView = (TextView) convertView.findViewById(R.id.info_name_output) ;

        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        Info_ListItem info_listItem = listViewItemList.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        //i_btn01ImageButton.setImageDrawable(info_listItem.getI_btn01());
        iconImageView.setImageDrawable(info_listItem.getIcon());
        the_dayTextView.setText(info_listItem.getThe_day());
        d_dayTextView.setText(info_listItem.getD_day());
        titleTextView.setText(info_listItem.getTitle());

        return convertView;
    }

    // 지정한 위치(position)에 있는 데이터와 관계된 아이템(row)의 ID를 리턴. : 필수 구현
    @Override
    public long getItemId(int position) {
        return position ;
    }

    // 지정한 위치(position)에 있는 데이터 리턴 : 필수 구현
    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position) ;
    }

    // 아이템 데이터 추가를 위한 함수. 개발자가 원하는대로 작성 가능.
    public void addItem( Drawable icon, String the_day, String d_day, String title ) {
        Info_ListItem item = new Info_ListItem();

        //item.setI_btn01(i_btn01);
        item.setIcon(icon);
        item.setThe_day(the_day);
        item.setD_day(d_day);
        item.setTitle(title);

        listViewItemList.add(item);
    }
}
