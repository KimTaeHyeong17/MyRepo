package com.example.uuzaz.teamcook04_1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class Main_Fragment_INFO extends Fragment {

    String[] contestname = {"인천시 SNS 통합 명칭 공모전","초 단편영화 공모전","대구 캐주얼 게임 공모전","상반기 구민 아이디어 공모","2018 강원 창의 디자인 공모전"};
    int[] contestposter = {R.drawable.info_pic,R.drawable.info_pic01,R.drawable.info_pic02,R.drawable.info_pic03,R.drawable.info_pic04};
    String[] contestdate = {"2018.09.15","2018.10.09","2018.12.09","2018.11.27","2018.10.15"};
    String[] contestdday = {"D-14","D-15","D-68","D-46","D-28"};

    public Main_Fragment_INFO() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main__fragment__info, null);

        ListView mListView = (ListView) view.findViewById(R.id.main_fragment_info_list);
        ContestInfoAdapter contestInfoAdapter = new ContestInfoAdapter(getActivity(), contestname, contestposter,contestdate,contestdday);
        mListView.setAdapter(contestInfoAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(),ContestInfoDetail.class);
                intent.putExtra("countryname", contestname[position]);
                intent.putExtra("countryflag", contestposter[position]);
                startActivity(intent);
            }
        });







        return view;
    }/** end of OnCreateView **/
}/** end of Main_Fragment_INFO**/
