package com.example.uuzaz.teamcook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter_Main extends FragmentStatePagerAdapter {
    private int tabCount;

    public TabPagerAdapter_Main(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        // Returning the current tabs
        switch (position) {
            case 0:
                Main_Fragment_INFO main_fragment_info = new Main_Fragment_INFO();
                return main_fragment_info;
            case 1:
                Main_Fragment_TeamSearch main_fragment_teamSearch = new Main_Fragment_TeamSearch();
                return main_fragment_teamSearch;

            default:
                return null;
        }
    }



    @Override
    public int getCount() {
        return tabCount;
    }
}
