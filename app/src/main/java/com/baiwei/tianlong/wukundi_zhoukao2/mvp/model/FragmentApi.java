package com.baiwei.tianlong.wukundi_zhoukao2.mvp.model;

import com.baiwei.tianlong.wukundi_zhoukao2.ConstantApi;
import com.baiwei.tianlong.wukundi_zhoukao2.mvp.model.beans.FragmentOneBeans;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FragmentApi {

    @GET(ConstantApi.HOUMIAN_URL)
    Flowable<FragmentOneBeans> getFragmentData();

}
