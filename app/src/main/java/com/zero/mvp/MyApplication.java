package com.zero.mvp;

import android.app.Application;
import android.content.Context;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * Created by admin on 2017/1/9.
 */

public class MyApplication extends Application {
    private static Context context;
    public static Retrofit myRetrofit;
    public static LoadUtils loadUtils;
    private static final String LOADURL = "www.baidu.com";

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        //构建Retrofit 对象
        myRetrofit = new Retrofit.Builder().
                baseUrl(LOADURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        loadUtils = myRetrofit.create(LoadUtils.class);
    }
}
