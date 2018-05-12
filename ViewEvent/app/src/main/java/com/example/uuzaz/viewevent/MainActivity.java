package com.example.uuzaz.viewevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Seoul",Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"London",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

/*
Button.OnClickListener myClick = new Button.OnClickListener() {

@Override
public void onClick(View v) {
switch(v.getId()){
case R.id.b1:
Toast.makeText(getApllicationContext(),"Seoul",Toast.LENGTH_LONG).show();
break;
case R.id.b2;
Toast.makeText(getApplicationContext(),"London",Toast.LENGTH_LING).show();
break;
}
}
};
findViewById(R.id.b1).setOncClickListener(myClick);
findViewById(R.id.b2).setOnClickListener(myClick);
 */
