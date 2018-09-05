package com.example.uuzaz.teamcook02_specail;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class Main_Profile_Fragment_Second extends Fragment {

    public Main_Profile_Fragment_Second() {
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
        View view = inflater.inflate(R.layout.fragment_main__profile__fragment__second, container, false);
        //ListView02
        TeamList_ListViewAdapter adapter;
        ListView listView;

        //ListView02
        // Adapter 생성
        adapter = new TeamList_ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listView = (ListView) view.findViewById(R.id.list_teamlist) ;
        listView.setAdapter(adapter) ;

        // 첫 번째 아이템 추가.
        adapter.addItem("9/15",
                "해커톤 공모전 같이 준비해요~~!!", "D - 12", "8") ;
        // 두 번째 아이템 추가.
        adapter.addItem("9/24",
                "부산아이디어 경진대회 여기 모여라", "D - 09", "7") ;
        // 세 번째 아이템 추가.
        adapter.addItem("9/29",
                "Start up, Step up 급구합니다~~", "D - 18", "7") ;
        // 네 번째 아이템 추가.
        adapter.addItem("10/04",
                "공모전 여기 붙어라,뿜 모두 모여라~", "D - 35", "4") ;
        // 다섯 번째 아이템 추가.
        adapter.addItem("10/17",
                "부산 대중교통 공모전 아이디어 급구", "D - 51", "6") ;
        // 여섯 번째 아이템 추가.
        adapter.addItem("9/15",
                "해커톤 공모전 같이 준비해요~~!!", "D - 12", "8") ;
        // 일곱 번째 아이템 추가.
        adapter.addItem("9/24",
                "부산아이디어 경진대회 여기 모여라", "D - 09", "7") ;
        // 여덟 번째 아이템 추가.
        adapter.addItem("9/29",
                "Start up, Step up 급구합니다~~", "D - 18", "7") ;
        // 아홉 번째 아이템 추가.
        adapter.addItem("10/04",
                "공모전 여기 붙어라,뿜 모두 모여라~", "D - 35", "4") ;
        // 열 번째 아이템 추가.
        adapter.addItem("10/17",
                "부산 대중교통 공모전 아이디어 급구", "D - 51", "6") ;

        return view;
    }

}
