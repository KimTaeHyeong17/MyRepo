package com.example.uuzaz.haningya;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("ValidFragment")
class StartSecondFragment extends android.support.v4.app.Fragment {



    public StartSecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] text = {"개같은 날이네요!\n 오늘도 화이팅","출근하기 싫죠? \n 어쩌겠어요 해야지",
        "개발자가 한땀한땀\n 쓴 글귀에요 개빡치네", "오늘이 무슨요일인지는\n 저도 몰라여\n 코드에 없거늗요",
        "how are you? \n find thank you and you?\n 몬말인지 알쥐? 빼앰!"};
        int randomNum = (int)(Math.random()*text.length);

        View view = inflater.inflate(R.layout.fragment_start_second, container, false);

        TextView text1 = (TextView) view.findViewById(R.id.sentence);
        text1.setText(text[randomNum]);
        // Inflate the layout for this fragment
        return view;
    }

}
