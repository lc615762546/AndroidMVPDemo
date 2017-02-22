package com.zero.mvp.view;

/**
 * Created by LC on 2017/2/22.
 */

public interface MvpBaseView {
    //加载成功更新view
    void upDateView(Object o);

    //显示错误信息
    void showMsg(String msg);

}
