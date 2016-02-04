package com.tresenraya.jrodriguez.tresenraya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton img1;
    ImageButton img2;
    ImageButton img3;
    ImageButton img4;
    ImageButton img5;
    ImageButton img6;
    ImageButton img7;
    ImageButton img8;
    ImageButton img9;
    private String player = "X";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = (ImageButton)findViewById(R.id.img1);
        img2 = (ImageButton)findViewById(R.id.img2);
        img3 = (ImageButton)findViewById(R.id.img3);
        img4 = (ImageButton)findViewById(R.id.img4);
        img5 = (ImageButton)findViewById(R.id.img5);
        img6 = (ImageButton)findViewById(R.id.img6);
        img7 = (ImageButton)findViewById(R.id.img7);
        img8 = (ImageButton)findViewById(R.id.img8);
        img9 = (ImageButton)findViewById(R.id.img9);

        img1.setOnClickListener(handler);
        img2.setOnClickListener(handler);
        img3.setOnClickListener(handler);
        img4.setOnClickListener(handler);
        img5.setOnClickListener(handler);
        img6.setOnClickListener(handler);
        img7.setOnClickListener(handler);
        img8.setOnClickListener(handler);
        img9.setOnClickListener(handler);

    }

    private View.OnClickListener handler = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            System.out.println("=======================");
            System.out.println(v);

            v.setBackgroundResource(R.drawable.x);

        }
    };
}
