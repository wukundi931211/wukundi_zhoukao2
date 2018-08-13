package com.baiwei.tianlong.wukundi_zhoukao2.mvp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.baiwei.tianlong.wukundi_zhoukao2.FragmentOneAdapter;
import com.baiwei.tianlong.wukundi_zhoukao2.R;
import com.baiwei.tianlong.wukundi_zhoukao2.base.BaseFragment;
import com.baiwei.tianlong.wukundi_zhoukao2.mvp.model.beans.FragmentOneBeans;
import com.baiwei.tianlong.wukundi_zhoukao2.mvp.presenter.FragmentPresenter;
import com.baiwei.tianlong.wukundi_zhoukao2.mvp.view.FragmentOneView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class FragmentOne extends BaseFragment<FragmentPresenter> implements FragmentOneView {

    @BindView(R.id.one_recycler)
    RecyclerView oneRecycler;
    Unbinder unbinder;

    @Override
    protected Object provideBindView() {
        return this;
    }

    @Override
    protected int provideFragmentLayoutID() {
        return R.layout.fragmentone;
    }

    @Override
    protected FragmentPresenter providePresenter() {
        return new FragmentPresenter(this);
    }

    @Override
    protected void initView(View view) {
        super.initView(view);
    }

    @Override
    protected void initData() {
        super.initData();
        if (presenter!=null){
            presenter.getFragmentData();
        }

    }

    //请求数据
    @Override
    public void getFragmentSuccess(FragmentOneBeans fragmentOneBeans) {
        final List<FragmentOneBeans.DataBean> data = fragmentOneBeans.getData();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        gridLayoutManager.setOrientation(GridLayoutManager.VERTICAL);


        FragmentOneAdapter fragmentOneAdapter = new FragmentOneAdapter(data,getContext());

        oneRecycler.setAdapter(fragmentOneAdapter);
        oneRecycler.setLayoutManager(gridLayoutManager);

    }

    @Override
    public void getFragmentFailed(String error) {

    }

    @Override
    public Context cotext() {
        return getContext();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
