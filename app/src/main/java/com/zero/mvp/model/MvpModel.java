package com.zero.mvp.model;

import com.zero.mvp.BaseCallBack;

/**
 * Created by LC on 2017/2/22.
 */

public interface MvpModel {
    void loadUser(String userName, BaseCallBack callBack);
}
