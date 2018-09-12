package com.example.uuzaz.teamcook04_1;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Main_Fragment_TeamSearch extends android.support.v4.app.Fragment {


    public Main_Fragment_TeamSearch() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main__fragment__team_search, container, false);


        //ListView02
        Team_Search_ListViewAdapter adapter;
        ListView listView;

        //ListView02
        // Adapter 생성
        adapter = new Team_Search_ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listView = (ListView) view.findViewById(R.id.list_team_search) ;
        listView.setAdapter(adapter) ;

        // 첫 번째 아이템 추가.
        adapter.addItem("2","5",
                "해커톤 공모전 같이 준비해요~~!!", "D - 12", "김재인") ;
        // 두 번째 아이템 추가.
        adapter.addItem("1","5",
                "부산아이디어 경진대회 여기 모여라", "D - 09", "김기현") ;
        // 세 번째 아이템 추가.
        adapter.addItem("2","6",
                "Start up, Step up 급구합니다~~", "D - 18", "최하윤") ;
        // 네 번째 아이템 추가.
        adapter.addItem("4","5",
                "공모전 여기 붙어라,뿜 모두 모여라~", "D - 35", "김태형") ;
        // 다섯 번째 아이템 추가.
        adapter.addItem("3","4",
                "부산 대중교통 공모전 아이디어 급구", "D - 51", "이교원") ;
        // 여섯 번째 아이템 추가.
        adapter.addItem("2","5",
                "해커톤 공모전 같이 준비해요~~!!", "D - 12", "김재인") ;
        // 일곱 번째 아이템 추가.
        adapter.addItem("1","5",
                "부산아이디어 경진대회 여기 모여라", "D - 09", "김기현") ;
        // 여덟 번째 아이템 추가.
        adapter.addItem("2","6",
                "Start up, Step up 급구합니다~~", "D - 18", "최하윤") ;
        // 아홉 번째 아이템 추가.
        adapter.addItem("4","5",
                "공모전 여기 붙어라,뿜 모두 모여라~", "D - 35", "김태형") ;
        // 열 번째 아이템 추가.
        adapter.addItem("3","4",
                "부산 대중교통 공모전 아이디어 급구", "D - 51", "이교원") ;

        return view;
    }


}
