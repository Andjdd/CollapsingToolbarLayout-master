package com.zsy.coordinatorlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

/**
 * Created by ${ls} on 2017/6/30.
 */

public abstract class TopBarBaseActivity extends AppCompatActivity {
    Toolbar toolbar;
    FrameLayout viewContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_top_bar);
        toolbar= (Toolbar) findViewById(R.id.toobar);
        viewContent= (FrameLayout) findViewById(R.id.viewContent);
        setSupportActionBar(toolbar);
        //设置不显示自带的title
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //将继承TopBarbaseActivtiy的布局解析到Framelayout里面
        LayoutInflater.from(TopBarBaseActivity.this).inflate(getContentView(),viewContent);
        init(savedInstanceState);
    }
protected abstract int getContentView();
    protected abstract void init(Bundle savedInstanceState);

}
