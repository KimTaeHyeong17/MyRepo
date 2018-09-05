package com.example.uuzaz.teamcook02_specail;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class Chat_Fragment_Talk extends Fragment {

    public Chat_Fragment_Talk() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_chat__fragment__talklist, container, false);

        //ListView02
        TalkList_ListViewAdapter adapter;
        ListView listView;

        //ListView02
        // Adapter 생성
        adapter = new TalkList_ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listView = (ListView) view.findViewById(R.id.list_talklist) ;
        listView.setAdapter(adapter) ;


        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.icon_profile_icon01),
                "해커톤 공모전 채팅방", "팀장", "김태형", "5") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.icon_profile_icon01),
                "부산아이디어 경진대회 채팅방", "팀장", "김기현","6") ;
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.icon_profile_icon01),
                "Start up, Step up 채팅방", "팀장", "최하윤","4") ;


        return view;

    }

}
