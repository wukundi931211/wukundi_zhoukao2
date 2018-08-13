package com.baiwei.tianlong.wukundi_zhoukao2.mvp.presenter;

import com.baiwei.tianlong.wukundi_zhoukao2.base.BasePresenter;
import com.baiwei.tianlong.wukundi_zhoukao2.mvp.model.FragmentOneModel;
import com.baiwei.tianlong.wukundi_zhoukao2.mvp.model.beans.FragmentOneBeans;
import com.baiwei.tianlong.wukundi_zhoukao2.mvp.view.FragmentOneView;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;

public class FragmentPresenter extends BasePresenter<FragmentOneView> {

    private FragmentOneModel fragmentOneModel;

    public FragmentPresenter(FragmentOneView view) {
        super(view);
    }

    @Override
    protected void initModel() {
        fragmentOneModel = new FragmentOneModel();
    }

    public void getFragmentData(){
        fragmentOneModel.getFragmentData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableSubscriber<FragmentOneBeans>() {
                    @Override
                    public void onNext(FragmentOneBeans fragmentOneBeans) {
                        if ("1".equals(fragmentOneBeans.getCode())){
                            if (view != null){
                                view.getFragmentSuccess(fragmentOneBeans);
                            }
                        }else {
                            if (view!=null){
                                view.getFragmentFailed(fragmentOneBeans.getMessage());
                            }
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
                        if (view !=null){
                            view.getFragmentFailed(t.toString());
                        }
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

}
