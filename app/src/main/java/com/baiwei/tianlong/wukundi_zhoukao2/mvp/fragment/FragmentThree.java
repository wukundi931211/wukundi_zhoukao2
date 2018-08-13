package com.baiwei.tianlong.wukundi_zhoukao2.mvp.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.baiwei.tianlong.wukundi_zhoukao2.R;
import com.baiwei.tianlong.wukundi_zhoukao2.base.BaseFragment;
import com.baiwei.tianlong.wukundi_zhoukao2.base.BasePresenter;

public class FragmentThree extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentthree,container,false);

        return view;
    }
}
