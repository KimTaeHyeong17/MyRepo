package com.example.uuzaz.teamcook04_1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

public class ChatActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    ImageButton btn_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        btn_back = (ImageButton) findViewById(R.id.id_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this, MainProfileActivity.class);
                startActivity(intent);
                finish();
            }
        });




        //ListView02
        TalkList_ListViewAdapter adapter;
        ListView listView;

        //ListView02
        // Adapter 생성
        adapter = new TalkList_ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listView = (ListView) findViewById(R.id.list_talklist) ;
        listView.setAdapter(adapter) ;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ChatActivity.this,Chat_Talk_Activity.class);
                startActivity(intent);
            }
        });


        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(ChatActivity.this, R.drawable.icon_profile_icon01),
                "해커톤 공모전 채팅방", "팀장", "김태형", "5") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(ChatActivity.this, R.drawable.icon_profile_icon01),
                "부산아이디어 경진대회 채팅방", "팀장", "김기현","6") ;
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(ChatActivity.this, R.drawable.icon_profile_icon01),
                "Start up, Step up 채팅방", "팀장", "최하윤","4") ;


/*


        // Initializing the TabLayout
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("현재 채팅"));
        tabLayout.addTab(tabLayout.newTab().setText("채팅 목록"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        // Initializing ViewPager
        viewPager = (ViewPager) findViewById(R.id.pager);

        // Creating TabPagerAdapter_Main adapter
        TabPagerAdapter_Chat pagerAdapter = new TabPagerAdapter_Chat(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        // Set TabSelectedListener
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        }); */
    }
}
