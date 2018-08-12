package com.example.uuzaz.teamcook;

import android.support.v4.app.FragmentStatePagerAdapter;

public class ProfilePagerAdapter extends FragmentStatePagerAdapter {
    public ProfilePagerAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Profile_Fragment_First();
            case 1:
                return new Profile_Fragment_Second();
            case 2:
                return new Profile_Fragment_Third();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}