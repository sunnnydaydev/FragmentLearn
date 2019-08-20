package com.sunnyday.fragmentlearn;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * LayoutInflater 详情参考：https://blog.csdn.net/u012702547/article/details/52628453
 * */
public class FragmentB extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_b, container, false);
    }

}
