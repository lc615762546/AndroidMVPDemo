package com.zero.mvp.bean;

/**
 * Created by LC on 2017/2/22.
 */

public class UserBean {
    private String userName;
    private String userTel;

    public UserBean(String userName, String userTel) {
        this.userName = userName;
        this.userTel = userTel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }
}
