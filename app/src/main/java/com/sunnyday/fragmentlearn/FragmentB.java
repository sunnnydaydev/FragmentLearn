package com.sunnyday.fragmentlearn;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * LayoutInflater 详情参考：https://blog.csdn.net/u012702547/article/details/52628453
 * */
public class FragmentB extends Fragment {

    private View mView;
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_b, container, false);
        textView = mView.findViewById(R.id.tv_text);
        return mView;
    }

    @SuppressLint("SetTextI18n")
    public void UpdateUI(){
        textView.setText("收到通知，更细UI");
    }

}
