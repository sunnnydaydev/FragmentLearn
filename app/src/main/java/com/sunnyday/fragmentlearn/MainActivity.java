package com.sunnyday.fragmentlearn;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnArticleSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获得FragmentManager对象
        FragmentManager fragmentManager = getSupportFragmentManager();
        // 通过FragmentManager对象获得FragmentTransaction对象(开启事务)
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fl_left, new FragmentA());//动态添加
        fragmentTransaction.add(R.id.fl_right,new FragmentB());

        fragmentTransaction.commit();//提交  提交  提交（很重要）


    }
}
