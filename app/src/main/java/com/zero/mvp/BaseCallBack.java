package com.zero.mvp;

/**
 * Created by LC on 2017/2/22.
 * model回调类，通知presenter 加载结果
 */

public interface BaseCallBack {
    //网络加载成功
    void loadSuccess(Object o);

    //网络加载失败
    void loadError(String errorMsg);
}
