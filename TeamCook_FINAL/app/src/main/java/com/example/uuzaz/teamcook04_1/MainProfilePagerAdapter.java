package com.example.uuzaz.teamcook04_1;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MainProfilePagerAdapter extends FragmentStatePagerAdapter {
    // Count number of tabs
    private int tabCount;

    public MainProfilePagerAdapter(android.support.v4.app.FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        // Returning the current tabs
        switch (position) {
            case 0:
                Main_Profile_Fragment_First main_profile_fragment_first = new Main_Profile_Fragment_First();
                return main_profile_fragment_first;
            case 1:
                Main_Profile_Fragment_Second main_profile_fragment_second = new Main_Profile_Fragment_Second();
                return main_profile_fragment_second;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}


