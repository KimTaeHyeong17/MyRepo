package com.example.uuzaz.teamcook;

import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ProfileActivity extends AppCompatActivity {
    ViewPager vp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        vp = (ViewPager) findViewById(R.id.vp);
        vp.setAdapter(new ProfilePagerAdapter(getSupportFragmentManager()));
        vp.setCurrentItem(0);


        class pagerAdapter extends FragmentStatePagerAdapter {
            public pagerAdapter(android.support.v4.app.FragmentManager fm) {
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

    }
}

