package com.zsy.coordinatorlayout;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.zsy.coordinatorlayout.helper.ItemDragHelperCallback;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends TopBarBaseActivity {

     @TargetApi(Build.VERSION_CODES.KITKAT)
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            Window window = getWindow();
//            window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
//                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//        }
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            Window window = getWindow();
//            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
//                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
//            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION  //该参数指布局能延伸到navigationbar，我们场景中不应加这个参数
//                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.setStatusBarColor(Color.TRANSPARENT);
//            window.setNavigationBarColor(Color.TRANSPARENT); //设置navigationbar颜色为透明
//        }
//        setContentView(R.layout.activity_main);
//        //沉浸式状态栏
//         getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
//        TextView text= (TextView) findViewById(R.id.text);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//// 给左上角图标的左边加上一个返回的图标
//        //getSupportActionBar().setDisplayShowTitleEnabled(false);
//
//        getSupportActionBar().setTitle("dsg");
//        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
//
//        getSupportActionBar().setSubtitle("Subtitle");
//
//        //给页面设置工具栏
//        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
//        if (collapsingToolbar != null) {
//            //设置隐藏图片时候ToolBar的颜色
//           collapsingToolbar.setContentScrimColor(Color.parseColor("#11B7F3"));
//            //设置工具栏标题
//            //  collapsingToolbar.setTitle("编程是一种信仰");
//              collapsingToolbar.setTitleEnabled(false);
//        }
//        List<CellData> list = initData();
//        if (mRecyclerView != null) {
//            mRecyclerView.setHasFixedSize(true);
//            LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
//            mRecyclerView.setLayoutManager(manager);
//            // 长按拖拽打开
//            ItemDragHelperCallback callback = new ItemDragHelperCallback() {
//                @Override
//                public boolean isLongPressDragEnabled() {
//                    return true;
//                }
//            };
//            ItemTouchHelper helper = new ItemTouchHelper(callback);
//            helper.attachToRecyclerView(mRecyclerView);
//            //设置adapter
//            MyAdapter mAdapter = new MyAdapter(list);
//            mRecyclerView.setAdapter(mAdapter);
//            //设置RecyclerView的每一项的点击事件
//            mAdapter.setRecyclerViewOnItemClickListener(new MyAdapter.RecyclerViewOnItemClickListener() {
//                @Override
//                public void onItemClickListener(View view, int position) {
//                    Snackbar.make(view, "点击了：" + position, Snackbar.LENGTH_SHORT).show();
//                }
//            });
//            //设置RecyclerView的每一项的长按事件
//            mAdapter.setOnItemLongClickListener(new MyAdapter.RecyclerViewOnItemLongClickListener() {
//                @Override
//                public boolean onItemLongClickListener(View view, int position) {
//                    Snackbar.make(view, "长按了：" + position, Snackbar.LENGTH_SHORT).show();
//                    return true;
//                }
//            });
//        }
//    }

    @Override
    protected int getContentView() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window window = getWindow();
            window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION  //该参数指布局能延伸到navigationbar，我们场景中不应加这个参数
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
            window.setNavigationBarColor(Color.TRANSPARENT); //设置navigationbar颜色为透明
        }
        return R.layout.activity_main;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
//沉浸式状态栏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//// 给左上角图标的左边加上一个返回的图标
        //getSupportActionBar().setDisplayShowTitl  eEnabled(false);

        getSupportActionBar().setTitle("dsg");
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);

        getSupportActionBar().setSubtitle("Subtitle");

        //给页面设置工具栏
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        if (collapsingToolbar != null) {
            //设置隐藏图片时候ToolBar的颜色
            collapsingToolbar.setContentScrimColor(Color.parseColor("#11B7F3"));
            //设置工具栏标题
            //  collapsingToolbar.setTitle("编程是一种信仰");
            collapsingToolbar.setTitleEnabled(false);
        }
        List<CellData> list = initData();
        if (mRecyclerView != null) {
            mRecyclerView.setHasFixedSize(true);
            LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
            mRecyclerView.setLayoutManager(manager);
            // 长按拖拽打开
            ItemDragHelperCallback callback = new ItemDragHelperCallback() {
                @Override
                public boolean isLongPressDragEnabled() {
                    return true;
                }
            };
            ItemTouchHelper helper = new ItemTouchHelper(callback);
            helper.attachToRecyclerView(mRecyclerView);
            //设置adapter
            MyAdapter mAdapter = new MyAdapter(list);
            mRecyclerView.setAdapter(mAdapter);
            //设置RecyclerView的每一项的点击事件
            mAdapter.setRecyclerViewOnItemClickListener(new MyAdapter.RecyclerViewOnItemClickListener() {
                @Override
                public void onItemClickListener(View view, int position) {
                    Snackbar.make(view, "点击了：" + position, Snackbar.LENGTH_SHORT).show();
                }
            });
            //设置RecyclerView的每一项的长按事件
            mAdapter.setOnItemLongClickListener(new MyAdapter.RecyclerViewOnItemLongClickListener() {
                @Override
                public boolean onItemLongClickListener(View view, int position) {
                    Snackbar.make(view, "长按了：" + position, Snackbar.LENGTH_SHORT).show();
                    return true;
                }
            });
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Toast.makeText(this,"点击了返回",Toast.LENGTH_SHORT).show();
                //点击了返回箭头
                break;
            case R.id.about:
                new AlertDialog.Builder(this).setMessage("作者:阿钟\ncsdn地址:http://blog.csdn.net/a_zhon/").show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private List<CellData> initData() {
        List<CellData> list = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            CellData cellData = new CellData("阿钟程序员 +" + i, "不想当项目经理的程序员不是个好程序员" + i);
            list.add(cellData);
        }
        return list;
    }

}
