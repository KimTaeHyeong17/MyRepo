package com.example.uuzaz.teamcook02_specail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TeamList_ListViewAdapter extends BaseAdapter {
    private ArrayList<TeamList_ListItem> listViewItemList = new ArrayList<TeamList_ListItem>() ;

    // ListViewAdapter의 생성자
    public TeamList_ListViewAdapter() {
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
            convertView = inflater.inflate(R.layout.listitem_teamlist, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        TextView contest_dayTextView = (TextView) convertView.findViewById(R.id.contest_day) ;
        TextView team_list_nameTextView = (TextView) convertView.findViewById(R.id.team_list_name) ;
        TextView d_day_team_listTextView = (TextView) convertView.findViewById(R.id.d_day_team_list) ;
        TextView team_memberTextView = (TextView) convertView.findViewById(R.id.team_member) ;

        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        TeamList_ListItem teamList_listItem = listViewItemList.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        contest_dayTextView.setText(teamList_listItem.getContest_day());
        team_list_nameTextView.setText(teamList_listItem.getTeam_list_name());
        d_day_team_listTextView.setText(teamList_listItem.getD_day_team_list());
        team_memberTextView.setText(teamList_listItem.getTeam_member());


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
    public void addItem(String contest_day, String team_list_name, String d_day_team_list, String team_member ) {
        TeamList_ListItem item = new TeamList_ListItem();

        item.setContest_day(contest_day);
        item.setTeam_list_name(team_list_name);
        item.setD_day_team_list(d_day_team_list);
        item.setTeam_member(team_member);

        listViewItemList.add(item);
    }
}
