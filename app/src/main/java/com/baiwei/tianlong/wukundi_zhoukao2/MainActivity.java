package com.baiwei.tianlong.wukundi_zhoukao2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.baiwei.tianlong.wukundi_zhoukao2.base.BaseActivity;
import com.baiwei.tianlong.wukundi_zhoukao2.base.BasePresenter;
import com.baiwei.tianlong.wukundi_zhoukao2.mvp.fragment.FragmentOne;
import com.baiwei.tianlong.wukundi_zhoukao2.mvp.fragment.FragmentThree;
import com.baiwei.tianlong.wukundi_zhoukao2.mvp.fragment.FragmentTwo;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {


    @BindView(R.id.fragment01)
    FrameLayout fragment01;
    @BindView(R.id.yemian1)
    Button yemian1;
    @BindView(R.id.yemian2)
    Button yemian2;
    @BindView(R.id.yemian3)
    Button yemian3;
    @BindView(R.id.linearlayout)
    LinearLayout linearlayout;

    private FragmentOne fragmentOne;
    private FragmentTwo fragmentTwo;
    private FragmentThree fragmentThree;

    @Override
    protected int provideLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected Activity provideBindView() {
        return this;
    }

    @Override
    protected void initView() {

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment01,new FragmentOne()).commit();

        super.initView();
    }

    @Override
    protected BasePresenter providePresenter() {
        return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.yemian1, R.id.yemian2, R.id.yemian3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.yemian1:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment01,new FragmentOne()).commit();
                break;
            case R.id.yemian2:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment01,new FragmentTwo()).commit();
                break;
            case R.id.yemian3:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment01,new FragmentThree()).commit();
                break;
        }
    }
}
