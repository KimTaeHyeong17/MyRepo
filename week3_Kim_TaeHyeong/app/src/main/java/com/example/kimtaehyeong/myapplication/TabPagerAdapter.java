package com.example.kimtaehyeong.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class TabPagerAdapter extends android.support.v4.app.FragmentStatePagerAdapter {

    //Count number of tabs
    private int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount=tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        //Returning the current tabs
        switch(position)
        {
            case 0:
                FirstFragment firstFragment = new FirstFragment();
                return firstFragment;
            case 1:
                SecondFragment secondFragment = new SecondFragment();
                return secondFragment;
            case 2:
                ThirdFragment thirdFragment = new ThirdFragment();
                return thirdFragment;
            case 3:
                FourthFragment fourthFragment = new FourthFragment();
                return fourthFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
