package com.sunnyday.fragmentlearn;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnArticleSelectedListener {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获得FragmentManager对象
        fragmentManager = getSupportFragmentManager();
        // 通过FragmentManager对象获得FragmentTransaction对象(开启事务)
        fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fl_left, new FragmentA(), "fragment_a");//动态添加
        fragmentTransaction.add(R.id.fl_right, new FragmentB(), "fragment_b");

        fragmentTransaction.commit();//提交  提交  提交（很重要）


    }


    @Override
    public void onArticleSelected(String url) {
        // 收到回调  通知fragmentB 做出处理
        FragmentB fragmentB = (FragmentB) fragmentManager.findFragmentByTag("fragment_b");
        assert fragmentB != null;
        fragmentB.UpdateUI();
    }
}
