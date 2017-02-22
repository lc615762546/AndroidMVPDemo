package com.zero.mvp.presenter;

import com.zero.mvp.BaseCallBack;
import com.zero.mvp.model.MvpModeImpl;
import com.zero.mvp.model.MvpModel;
import com.zero.mvp.view.MvpBaseView;

/**
 * Created by LC on 2017/2/22.
 * Presenter  ，持有 model  和view 引用
 */

public class MvpPresenter {
    MvpModel model;
    MvpBaseView view;

    public MvpPresenter(MvpBaseView view) {
        this.view = view;
        model = new MvpModeImpl();
    }

    public void loadUser(String userName) {
        model.loadUser(userName, new BaseCallBack() {
            @Override
            public void loadSuccess(Object o) {
                view.upDateView(o);
            }

            @Override
            public void loadError(String errorMsg) {
                view.showMsg(errorMsg);
            }
        });

    }
}
