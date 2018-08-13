package com.baiwei.tianlong.wukundi_zhoukao2.mvp.model;

import com.baiwei.tianlong.wukundi_zhoukao2.RetrofitcManager;
import com.baiwei.tianlong.wukundi_zhoukao2.mvp.model.beans.FragmentOneBeans;

import io.reactivex.Flowable;

public class FragmentOneModel implements FragmentApi {
    @Override
    public Flowable<FragmentOneBeans> getFragmentData() {
        return RetrofitcManager.getDefault().create(FragmentApi.class).getFragmentData();
    }
}
