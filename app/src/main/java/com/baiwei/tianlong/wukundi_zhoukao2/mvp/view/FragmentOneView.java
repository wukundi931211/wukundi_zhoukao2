package com.baiwei.tianlong.wukundi_zhoukao2.mvp.view;

import com.baiwei.tianlong.wukundi_zhoukao2.base.IView;
import com.baiwei.tianlong.wukundi_zhoukao2.mvp.model.FragmentApi;
import com.baiwei.tianlong.wukundi_zhoukao2.mvp.model.beans.FragmentOneBeans;

public interface FragmentOneView extends IView{
        void getFragmentSuccess(FragmentOneBeans fragmentOneBeans);

        void getFragmentFailed(String error);
}
