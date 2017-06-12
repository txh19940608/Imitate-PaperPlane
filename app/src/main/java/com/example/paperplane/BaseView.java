package com.example.paperplane;

import android.view.View;

/**
 * Created by Administrator on 2017/5/16.
 */

public interface BaseView<T> {

    /**
     * set the presenter of mvp
     * @param presenter
     */
    void setPresenter(T presenter);

    /**
     * init the views of fragment
     * @param view
     */
    void initViews(View view);

}
