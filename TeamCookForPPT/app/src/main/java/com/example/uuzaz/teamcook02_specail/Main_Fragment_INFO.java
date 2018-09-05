package com.example.uuzaz.teamcook02_specail;


import android.content.ClipData;
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
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main_Fragment_INFO extends Fragment {

    String[] countryNames = {"인천시 SNS 통합 명칭 공모전","초 단편영화 공모전","대구 캐주얼 게임 공모전","상반기 구민 아이디어 공모","2018 강원 창의 디자인 공모전"};
    int[] countryFlags = {R.drawable.info_pic,R.drawable.info_pic01,R.drawable.info_pic02,R.drawable.info_pic03,R.drawable.info_pic04};


    public Main_Fragment_INFO() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main__fragment__info, null);

        ListView mListView = (ListView) view.findViewById(R.id.main_fragment_info_list);
        ContestInfoAdapter contestInfoAdapter = new ContestInfoAdapter(getActivity(), countryNames,countryFlags);
        mListView.setAdapter(contestInfoAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(),ContestInfoDetail.class);
                intent.putExtra("countryname",countryNames[position]);
                intent.putExtra("countryflag",countryFlags[position]);
                startActivity(intent);
            }
        });







        return view;
    }/** end of OnCreateView **/
}/** end of Main_Fragment_INFO**/
