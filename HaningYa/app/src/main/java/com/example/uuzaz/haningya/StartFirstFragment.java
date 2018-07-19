package com.example.uuzaz.haningya;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SuppressLint("ValidFragment")
class StartFirstFragment extends android.support.v4.app.Fragment {


    //오늘 날짜 계산후 표시
    long mNow;
    Date mDate;
    SimpleDateFormat mFormat = new SimpleDateFormat("yyyy-MM-dd");
    TextView mTextView;


    public StartFirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        View view = inflater.inflate(R.layout.fragment_start_first, container, false);

        TextView mTextView= (TextView) view.findViewById(R.id.date);
        mTextView.setText(getTime());
        return inflater.inflate(R.layout.fragment_start_first, container, false);
    }
    //오늘 날짜 계산후 표시
    private String getTime() {
        mNow = System.currentTimeMillis();
        mDate = new Date(mNow);
        return mFormat.format(mDate);
    }



}

