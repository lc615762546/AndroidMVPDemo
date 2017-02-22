package com.zero.mvp;

import com.zero.mvp.bean.UserBean;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface LoadUtils {

    @FormUrlEncoded
    @POST("/get_user/")//post提交，拼接URL
    Call<UserBean> getUserInfo(@Field("userName") String userName);
}
