package com.sunnyday.fragmentlearn;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * LayoutInflater 详情参考：https://blog.csdn.net/u012702547/article/details/52628453
 */
public class FragmentA extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_a, container, false);
        mView.findViewById(R.id.tv_text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "左面按钮事件触发", Toast.LENGTH_SHORT).show();
            }
        });
        return mView;
    }

}
