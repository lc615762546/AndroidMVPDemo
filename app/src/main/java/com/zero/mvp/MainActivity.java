package com.zero.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.zero.androidmvpdemo.R;
import com.zero.mvp.bean.UserBean;
import com.zero.mvp.presenter.MvpPresenter;
import com.zero.mvp.view.MvpBaseView;

public class MainActivity extends AppCompatActivity implements MvpBaseView {

    private TextView name, tel;
    private MvpPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        name = (TextView) findViewById(R.id.name);
        tel = (TextView) findViewById(R.id.tel);
    }

    private void initData() {
        presenter = new MvpPresenter(this);
        presenter.loadUser("test");
    }

    @Override
    public void upDateView(Object o) {
        UserBean bean = (UserBean) o;
        if (bean != null) {
            name.setText(bean.getUserName());
            name.setText(bean.getUserTel());
        }
    }

    @Override
    public void showMsg(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}
