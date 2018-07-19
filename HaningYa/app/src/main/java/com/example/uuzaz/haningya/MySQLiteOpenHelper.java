package com.example.uuzaz.haningya;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;




    /*
     * sql을 사용하기 위한 제반 클래
     * SQLiteOpenHelper는 사용에 도움을 주는 클래스이다
     * 데이터베이스를 생성하거나 업그레이드 하는기능 또는, 오픈하려면 SQLiteOpenHelper 객체를 사용한다.
     * SQLiteOpenHelper 클래스를 상속받아 구현하려면
     *     1) 생성 메소드 : 상위 클래스의 생성 메소드를 호출, Activity 등의 Context 인스턴스와
     *                          데이터베이스의 이름, 커서 팩토리(보통 Null 지정) 등을 지정하고,
     *                          데이터베이스 스키마 버전을 알려주는 숫자값을 넘겨 준다.
     *     2) onCreate() 메소드 : SQLiteDatabase를 넘겨 받으며, 데이블을 생성하고 초기 데이터를
     *                                  추가하기에 적당한 위치이다.
     *     3) onUpgrade() 메소드 : SQLiteDatabase 인스턴스를 넘겨 받으며, 현재 스키마 버전과
     *                                     최신 스키마 버전 번호도 받는다.
     *
     * 위의 세가지 기능을 사용해야한다.
     */

    public class MySQLiteOpenHelper extends SQLiteOpenHelper {

        public MySQLiteOpenHelper(Context context, String name,
                                  SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
            // TODO Auto-generated constructor stub
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            // TODO Auto-generated method stub
            // SQL 쿼리문은 다음과 같은 형태로도 실행 할 수도 있다.
            // SQLiteOpenHelper 가 최초 실행 되었을 때
            String sql = "create table student (" +
                    "_id integer primary key autoincrement, " +
                    "memo_1 text, memo_2 text, memo_3 text,memo_4 text,memo_5 text,memo_6 text,memo_7 text,memo_8 text,memo_9 text," +
                    "memo_10 text, memo_11 text,memo_12 text,memo_13 text,memo_14 text,memo_15 text,memo_16 text,memo_17 text," +
                    "memo_18 text,memo_19 text,memo_20 text,memo_21 text,memo_22 text,memo_23 text,memo_24 text);";
            db.execSQL(sql);
        }


        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            // db = 적용할 db, old/new 구 버전/신버전

            // TODO Auto-generated method stub

            /*
             * db 버전이 업그레이드 되었을 때 실행되는 메소드
             * 이 부분은 사용에 조심해야 하는 일이 많이 있다. 버전이 1인 사용자가 2로 바뀌면
             * 한번의 수정만 하면 되지만 버전이 3으로 되면 1인 사용자가 2, 3을 거쳐야 하고
             * 2인 사용자는 3 까지만 거치면 된다. 이렇게 증가할 수록 수정할 일이 많아지므로
             * 적절히 사용해야 하며 가능하면 최초 설계 시에 완벽을 기하는 것이 가장 좋을 것이다.
             * 테스트에서는 기존의 데이터를 모두 지우고 다시 만드는 형태로 하겠다.
             */

            String sql = "drop table if exists student";
            db.execSQL(sql);
            onCreate(db); // 테이블을 지웠으므로 다시 테이블을 만들어주는 과정

        }

    }