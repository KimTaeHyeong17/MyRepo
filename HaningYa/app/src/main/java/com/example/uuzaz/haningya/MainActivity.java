package com.example.uuzaz.haningya;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //오늘 날짜 계산후 표시
    long mNow;
    Date mDate;
    SimpleDateFormat mFormat = new SimpleDateFormat("yyyy-MM-dd");
    TextView mTextView;
    ImageButton btn_menu;
    /**drawer button**/
    Button btn_Lookback, button_viewALL;
    /** drawer **/
    private String TAG = "MainActivity";
    private Context mContext = MainActivity.this;
    private ViewGroup mainLayout;   //사이드 나왔을때 클릭방지할 영역
    private ViewGroup viewLayout;   //전체 감싸는 영역
    private ViewGroup sideLayout;   //사이드바만 감싸는 영역
    private Boolean isMenuShow = false;
    private Boolean isExitFlag = false;
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            onBackPressed();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        if (isMenuShow) {
            closeMenu();
        } else {
            if (isExitFlag) {
                finish();
            } else {
                isExitFlag = true;
                Toast.makeText(this, "뒤로가기를 한번더 누르시면 앱이 종료안될껄요.", Toast.LENGTH_SHORT).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        isExitFlag = false;
                    }
                }, 2000);
            }
        }
    }
    /** end of drawer **/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**bind view 날짜 나타내기**/
        mTextView = (TextView) findViewById(R.id.today_date);
        mTextView.setText(getTime());
        init();
        addSideView();  //사이드바 add
        /**drawer**/
        btn_Lookback = (Button) findViewById(R.id.btn_lookback);
        button_viewALL = (Button) findViewById(R.id.button_viewAll);
        /**일주일보기 intent**/
        btn_Lookback = (Button) findViewById(R.id.btn_lookback);
        btn_Lookback.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "일주일 돌아보기", 1000).show();
                Intent MyIntent = new Intent(MainActivity.this, Look_Back.class);
                startActivity(MyIntent);
            }
        });
        /**과거일정 intent**/
        button_viewALL.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "일주일 돌아보기", 1000).show();
                Intent MyIntent = new Intent(MainActivity.this, PastSchedule.class);
                startActivity(MyIntent);
            }
        });







    } /** end of onCreate**/


    /**오늘 날짜 계산후 표시**/
    private String getTime() {
        mNow = System.currentTimeMillis();
        mDate = new Date(mNow);
        return mFormat.format(mDate);
    }

    /** drawer **/
    private void init() {
        findViewById(R.id.btn_menu).setOnClickListener(this);
        mainLayout = findViewById(R.id.id_main);
        viewLayout = findViewById(R.id.fl_silde);
        sideLayout = findViewById(R.id.view_sildebar);
    }
    private void addSideView() {
        SideBarView sidebar = new SideBarView(mContext);
        sideLayout.addView(sidebar);
        viewLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        sidebar.setEventListener(new SideBarView.EventListener() {
            @Override
            public void btnCancel() {
                Log.e(TAG, "btnCancel");
                closeMenu();
            }
        });
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_menu:
                showMenu();
                break;
        }
    }
    public void closeMenu() {
        isMenuShow = false;
        Animation slide = AnimationUtils.loadAnimation(mContext, R.anim.sidebar_hidden);
        sideLayout.startAnimation(slide);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                viewLayout.setVisibility(View.GONE);
                viewLayout.setEnabled(false);
                mainLayout.setEnabled(true);
            }
        }, 450);
    }

    public void showMenu() {
        isMenuShow = true;
        Animation slide = AnimationUtils.loadAnimation(this, R.anim.sidebar_show);
        sideLayout.startAnimation(slide);
        viewLayout.setVisibility(View.VISIBLE);
        viewLayout.setEnabled(true);
        mainLayout.setEnabled(false);
        Log.e(TAG, "메뉴버튼 클릭");
    }
    /** end of drawer **/

}
/**MainActivity Bracket**/


