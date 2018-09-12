package com.example.uuzaz.teamcook04_1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TalkList_ListViewAdapter extends BaseAdapter {
    private ArrayList<TalkList_ListItem> listViewItemList = new ArrayList<TalkList_ListItem>() ;

    // ListViewAdapter의 생성자
    public TalkList_ListViewAdapter() {
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
            convertView = inflater.inflate(R.layout.listitem_talklist, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        ImageView talklist_profile_iconImageView = (ImageView) convertView.findViewById(R.id.talklist_profile_icon) ;
        TextView talklist_nameTextView = (TextView) convertView.findViewById(R.id.talklist_name) ;
        TextView team_leader_talklistTextView = (TextView) convertView.findViewById(R.id.team_leader_talklist) ;
        TextView team_leader_name_talklistTextView = (TextView) convertView.findViewById(R.id.team_leader_name_talklist) ;
        TextView team_member_talklistTextView = (TextView) convertView.findViewById(R.id.team_member_talklist) ;

        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        TalkList_ListItem talkList_listItem = listViewItemList.get(position);


        // 아이템 내 각 위젯에 데이터 반영
        talklist_profile_iconImageView.setImageDrawable(talkList_listItem.getTalklist_profile_icon());
        talklist_nameTextView.setText(talkList_listItem.getTalklist_name());
        team_leader_talklistTextView.setText(talkList_listItem.getTeam_leader_talklist());
        team_leader_name_talklistTextView.setText(talkList_listItem.getTeam_leader_name_talklist());
        team_member_talklistTextView.setText(talkList_listItem.getTeam_member_talklist());

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
    public void addItem(Drawable talklist_profile_icon, String talklist_name, String team_leader_talklist, String team_leader_name_talklist, String team_member_talklist ) {
        TalkList_ListItem item = new TalkList_ListItem();

        item.setTalklist_profile_icon(talklist_profile_icon);
        item.setTalklist_name(talklist_name);
        item.setTeam_leader_talklist(team_leader_talklist);
        item.setTeam_leader_name_talklist(team_leader_name_talklist);
        item.setTeam_member_talklist(team_member_talklist);

        listViewItemList.add(item);
    }
}
