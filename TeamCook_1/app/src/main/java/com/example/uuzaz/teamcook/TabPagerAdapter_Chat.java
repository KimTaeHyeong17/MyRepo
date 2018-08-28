package com.example.uuzaz.teamcook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter_Chat extends FragmentStatePagerAdapter {
    private int tabCount;

    public TabPagerAdapter_Chat(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        // Returning the current tabs
        switch (position) {
            case 0:
                Chat_Fragment_List chat_fragment_list = new Chat_Fragment_List();
                return chat_fragment_list;
            case 1:
                Chat_Fragment_Talk chat_fragment_talk = new Chat_Fragment_Talk();
                return chat_fragment_talk;

            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return tabCount;
    }
}




