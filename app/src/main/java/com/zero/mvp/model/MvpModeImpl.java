package com.zero.mvp.model;

import com.zero.mvp.BaseCallBack;
import com.zero.mvp.MyApplication;
import com.zero.mvp.bean.UserBean;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by LC on 2017/2/22.
 * XXXXXXimpl 接口实现为j2EE常用写法
 */

public class MvpModeImpl implements MvpModel {
    @Override
    public void loadUser(String userName, final BaseCallBack callBack) {
        //此处使用Retrofit2.0加载网络数据
        Call<UserBean> call = MyApplication.loadUtils.getUserInfo(userName);
        call.enqueue(new Callback<UserBean>() {
            @Override
            public void onResponse(Call<UserBean> call, Response<UserBean> response) {
//                callBack.loadSuccess(response.body());
                UserBean bean = new UserBean("userName", "123456");
                callBack.loadSuccess(bean);
            }

            @Override
            public void onFailure(Call<UserBean> call, Throwable t) {
                callBack.loadError("加载失败");
            }
        });
    }
}
