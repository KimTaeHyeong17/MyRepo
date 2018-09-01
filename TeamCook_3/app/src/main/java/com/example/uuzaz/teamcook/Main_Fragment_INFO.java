package com.example.uuzaz.teamcook;


import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main_Fragment_INFO extends Fragment {

    /*//ListView01
    static final String[] LIST_MENU = {"LIST1", "LIST2", "LIST3"};*/

    //ListVIew00
    //private ArrayList<Info_ListItem> data = null;



    public Main_Fragment_INFO() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_main__fragment__info, container, false);

        View view = inflater.inflate(R.layout.fragment_main__fragment__info, null);

        Button info = (Button) view.findViewById(R.id.btn_contest_info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ContestInfoDetail.class);
                startActivity(intent);
            }
        });

        Button start = (Button) view.findViewById(R.id.btn_create_team_temp);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CreateTeamActivity.class);
                startActivity(intent);
            }
        });


        /*//ListView01
        ArrayAdapter adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,LIST_MENU);
        ListView listView = (ListView) view.findViewById(R.id.list_info);
        listView.setAdapter(adapter);*/

        //ListView02
        Info_ListViewAdapter adapter;
        ListView listView;

        //ListView02
        // Adapter 생성
        adapter = new Info_ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listView = (ListView) view.findViewById(R.id.list_info) ;
        listView.setAdapter(adapter) ;

        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.info_pic),
                "2018-08-10", "D - 12", "해커톤") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.info_pic01),
                "2018-08-19", "D - 09", "부산아이디어 경진대회") ;
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.info_pic02),
                "2018-09-24", "D - 18", "Start up, Step up 꿈터 경진대회") ;
        // 네 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.info_pic01),
                "2018-10-19", "D - 35", "창업동아리") ;
        // 다섯 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.info_pic02),
                "2018-11-28", "D - 51", "장영실 공모전") ;





       /* // 위에서 생성한 listview에 클릭 이벤트 핸들러 정의.
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                // get item
                Info_ListItem item = (Info_ListItem) parent.getItemAtPosition(position) ;

                Drawable iconDrawable = item.getIcon() ;
                String the_dayStr = item.getThe_day() ;
                String d_dayStr = item.getD_day() ;
                String titleStr = item.getTitle() ;


            }
        }) ;
*/

        //return super.onCreateView(inflater, container, savedInstanceState);
        return view;



        //ListView00
       /* View view = inflater.inflate(R.layout.fragment_main__fragment__info, null);
        ArrayAdapter Adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1);

        ListView listview = (ListView) view.findViewById(R.id.list_info);

        data = new ArrayList<>();

        Info_ListViewAdapter adapter = new Info_ListViewAdapter(this, R.layout.listitem_info, data);
        listview.setAdapter(adapter);


        return view;*/
    }

    //ListView02


  /*  public void addItem(Drawable icon, String the_day, String d_day, String title) {
        adapter.addItem(icon, the_day,d_day, title);
    }*/







}
