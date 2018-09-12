package com.example.uuzaz.teamcook04_1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CreateTeamActivity extends AppCompatActivity implements View.OnClickListener {

    int count = 0; // count button pressed
    ImageButton btn_make_team_back;
    Button btn_make_team;
    TextView member_num;

    ImageButton btn_developer, btn_manager, btn_designer, btn_nobody;
    ImageView view_first_person, view_second_person, view_third_person, view_fourth_person, view_fifth_person, view_sixth_person;
    Button btn_reset_team;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_team);


        /**사람을 넣어봅시다**/
        btn_reset_team = (Button) findViewById(R.id.id_reset_team);
        btn_reset_team.setOnClickListener(this);
        member_num = (TextView) findViewById(R.id.id_member_num);
        member_num.setText("0");
        btn_developer = (ImageButton) findViewById(R.id.id_developer);
        btn_developer.setOnClickListener(this);
        btn_manager = (ImageButton) findViewById(R.id.id_manager);
        btn_manager.setOnClickListener(this);
        btn_designer = (ImageButton) findViewById(R.id.id_desinger);
        btn_designer.setOnClickListener(this);
        btn_nobody = (ImageButton) findViewById(R.id.id_nobody);
        btn_nobody.setOnClickListener(this);


        view_first_person = (ImageView) findViewById(R.id.id_first_person);
        view_second_person = (ImageView) findViewById(R.id.id_second_person);
        view_third_person = (ImageView) findViewById(R.id.id_third_person);
        view_fourth_person = (ImageView) findViewById(R.id.id_fourth_person);
        view_fifth_person = (ImageView) findViewById(R.id.id_fifth_person);
        view_sixth_person = (ImageView) findViewById(R.id.id_sixth_person);


        /**뒤로가기버튼**/
        btn_make_team_back = (ImageButton) findViewById(R.id.btn_back_make_team);
        btn_make_team = (Button) findViewById(R.id.btn_make_team);

        btn_make_team_back.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateTeamActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        /**팀생성하기버튼**/
        btn_make_team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(CreateTeamActivity.this, "잘못된 이메일 형식입니다", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(CreateTeamActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    } //end of oncreate

    /**
     * 사람넣는 버튼 onclick
     **/
    @Override
    public void onClick(View v) {

        count++;
        switch (v.getId()) {
            case R.id.id_desinger:
                if (count == 1) {
                    Toast.makeText(CreateTeamActivity.this, "first designer person", Toast.LENGTH_SHORT).show();
                    view_first_person.setImageResource(R.drawable.icon_designer);
                    member_num.setText("1");
                    break;
                }
                if (count == 2) {
                    Toast.makeText(CreateTeamActivity.this, "second designer person", Toast.LENGTH_SHORT).show();
                    view_second_person.setImageResource(R.drawable.icon_designer);
                    member_num.setText("2");
                    break;
                }
                if (count == 3) {
                    Toast.makeText(CreateTeamActivity.this, "third designer person", Toast.LENGTH_SHORT).show();
                    view_third_person.setImageResource(R.drawable.icon_designer);
                    member_num.setText("3");
                    break;
                }
                if (count == 4) {
                    Toast.makeText(CreateTeamActivity.this, "fourth designer person", Toast.LENGTH_SHORT).show();
                    view_fourth_person.setImageResource(R.drawable.icon_designer);
                    member_num.setText("4");
                    break;
                }
                if (count == 5) {
                    Toast.makeText(CreateTeamActivity.this, "fifth designer person", Toast.LENGTH_SHORT).show();
                    view_fifth_person.setImageResource(R.drawable.icon_designer);
                    member_num.setText("5");
                    break;
                }
                if (count == 6) {
                    Toast.makeText(CreateTeamActivity.this, "sixth designer person", Toast.LENGTH_SHORT).show();
                    view_sixth_person.setImageResource(R.drawable.icon_designer);
                    member_num.setText("6");
                    break;
                }


            case R.id.id_developer:
                if (count == 1) {
                    Toast.makeText(CreateTeamActivity.this, "first developer person", Toast.LENGTH_SHORT).show();
                    view_first_person.setImageResource(R.drawable.icon_developer);
                    member_num.setText("1");
                    break;
                }
                if (count == 2) {
                    Toast.makeText(CreateTeamActivity.this, "second developer person", Toast.LENGTH_SHORT).show();
                    view_second_person.setImageResource(R.drawable.icon_developer);
                    member_num.setText("2");
                    break;
                }
                if (count == 3) {
                    Toast.makeText(CreateTeamActivity.this, "third developer person", Toast.LENGTH_SHORT).show();
                    view_third_person.setImageResource(R.drawable.icon_developer);
                    member_num.setText("3");
                    break;
                }
                if (count == 4) {
                    Toast.makeText(CreateTeamActivity.this, "fourth developer person", Toast.LENGTH_SHORT).show();
                    view_fourth_person.setImageResource(R.drawable.icon_developer);
                    member_num.setText("4");
                    break;
                }
                if (count == 5) {
                    Toast.makeText(CreateTeamActivity.this, "fifth developer person", Toast.LENGTH_SHORT).show();
                    view_fifth_person.setImageResource(R.drawable.icon_developer);
                    member_num.setText("5");
                    break;
                }
                if (count == 6) {
                    Toast.makeText(CreateTeamActivity.this, "sixth developer person", Toast.LENGTH_SHORT).show();
                    view_sixth_person.setImageResource(R.drawable.icon_developer);
                    member_num.setText("6");
                    break;
                }

            case R.id.id_manager:
                if (count == 1) {
                    Toast.makeText(CreateTeamActivity.this, "first manager person", Toast.LENGTH_SHORT).show();
                    view_first_person.setImageResource(R.drawable.icon_manager);
                    member_num.setText("1");
                    break;
                }
                if (count == 2) {
                    Toast.makeText(CreateTeamActivity.this, "second manager person", Toast.LENGTH_SHORT).show();
                    view_second_person.setImageResource(R.drawable.icon_manager);
                    member_num.setText("2");
                    break;
                }
                if (count == 3) {
                    Toast.makeText(CreateTeamActivity.this, "third manager person", Toast.LENGTH_SHORT).show();
                    view_third_person.setImageResource(R.drawable.icon_manager);
                    member_num.setText("3");
                    break;
                }
                if (count == 4) {
                    Toast.makeText(CreateTeamActivity.this, "fourth manager person", Toast.LENGTH_SHORT).show();
                    view_fourth_person.setImageResource(R.drawable.icon_manager);
                    member_num.setText("4");
                    break;
                }
                if (count == 5) {
                    Toast.makeText(CreateTeamActivity.this, "fifth person", Toast.LENGTH_SHORT).show();
                    view_fifth_person.setImageResource(R.drawable.icon_manager);
                    member_num.setText("5");
                    break;
                }
                if (count == 6) {
                    Toast.makeText(CreateTeamActivity.this, "sixth person", Toast.LENGTH_SHORT).show();
                    view_sixth_person.setImageResource(R.drawable.icon_manager);
                    member_num.setText("6");
                    break;
                }
            case R.id.id_nobody:
                if (count == 1) {
                    Toast.makeText(CreateTeamActivity.this, "first nobody person", Toast.LENGTH_SHORT).show();
                    view_first_person.setImageResource(R.drawable.icon_nobody);
                    member_num.setText("1");
                    break;
                }
                if (count == 2) {
                    Toast.makeText(CreateTeamActivity.this, "second nobody person", Toast.LENGTH_SHORT).show();
                    view_second_person.setImageResource(R.drawable.icon_nobody);
                    member_num.setText("2");
                    break;
                }
                if (count == 3) {
                    Toast.makeText(CreateTeamActivity.this, "third nobody person", Toast.LENGTH_SHORT).show();
                    view_third_person.setImageResource(R.drawable.icon_nobody);
                    member_num.setText("3");
                    break;
                }
                if (count == 4) {
                    Toast.makeText(CreateTeamActivity.this, "fourth nobody person", Toast.LENGTH_SHORT).show();
                    view_fourth_person.setImageResource(R.drawable.icon_nobody);
                    member_num.setText("4");
                    break;
                }
                if (count == 5) {
                    Toast.makeText(CreateTeamActivity.this, "fifth nobody person", Toast.LENGTH_SHORT).show();
                    view_fifth_person.setImageResource(R.drawable.icon_nobody);
                    member_num.setText("5");
                    break;
                }
                if (count == 6) {
                    Toast.makeText(CreateTeamActivity.this, "sixth nobody person", Toast.LENGTH_SHORT).show();
                    view_sixth_person.setImageResource(R.drawable.icon_nobody);
                    member_num.setText("6");
                    break;
                }
            case R.id.id_reset_team:
                count = 0;
                view_first_person.setImageResource(R.drawable.icon_empty_person);
                view_second_person.setImageResource(R.drawable.icon_empty_person);
                view_third_person.setImageResource(R.drawable.icon_empty_person);
                view_fourth_person.setImageResource(R.drawable.icon_empty_person);
                view_fifth_person.setImageResource(R.drawable.icon_empty_person);
                view_sixth_person.setImageResource(R.drawable.icon_empty_person);
                break;


        } /** end of swwitch **/


    } /** end of OnClick  **/
} /**
 * end of java class
 **/
