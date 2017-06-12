package com.example.paperplane;

/**
 * Created by Administrator on 2017/4/16.
 */

public interface BasePresenter {

    //获取数据并改变界面显示，在todo-mvp的项目中调用时机为Fragment的OnResume()方法中
    void start();
}
