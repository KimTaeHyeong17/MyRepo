package com.example.uuzaz.teamcook02_specail;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class Team_Search_ListViewAdapter extends BaseAdapter {
    private ArrayList<Team_Search_ListItem> listViewItemList = new ArrayList<Team_Search_ListItem>() ;

    // ListViewAdapter의 생성자
    public Team_Search_ListViewAdapter() {
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
            convertView = inflater.inflate(R.layout.listitem_team_search, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        TextView summit_counterTextView = (TextView) convertView.findViewById(R.id.summit_counter) ;
        TextView team_number_fullTextView = (TextView) convertView.findViewById(R.id.team_number_full) ;
        TextView team_search_nameTextView = (TextView) convertView.findViewById(R.id.team_search_name) ;
        TextView d_day_team_searchTextView = (TextView) convertView.findViewById(R.id.d_day_team_search) ;
        TextView team_leader_nameTextView = (TextView) convertView.findViewById(R.id.team_leader_name) ;

        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        Team_Search_ListItem team_search_listItem = listViewItemList.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        summit_counterTextView.setText(team_search_listItem.getSummit_counter());
        team_number_fullTextView.setText(team_search_listItem.getTeam_number_full());
        team_search_nameTextView.setText(team_search_listItem.getTeam_search_name());
        d_day_team_searchTextView.setText(team_search_listItem.getD_day_team_search());
        team_leader_nameTextView.setText(team_search_listItem.getTeam_leader_name());

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
    public void addItem(String summit_counter, String team_number_full, String team_search_name, String d_day_team_search, String team_leader_name ) {
        Team_Search_ListItem item = new Team_Search_ListItem();

        item.setSummit_counter(summit_counter);
        item.setTeam_number_full(team_number_full);
        item.setTeam_search_name(team_search_name);
        item.setD_day_team_search(d_day_team_search);
        item.setTeam_leader_name(team_leader_name);

        listViewItemList.add(item);
    }
}
