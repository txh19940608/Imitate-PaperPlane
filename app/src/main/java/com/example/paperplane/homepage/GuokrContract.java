package com.example.paperplane.homepage;

import com.example.paperplane.BasePresenter;
import com.example.paperplane.BaseView;
import com.example.paperplane.bean.GuokrHandpickNews;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/7.
 */

public interface GuokrContract {

    interface View extends BaseView<Presenter> {

        void showError();

        void showResults(ArrayList<GuokrHandpickNews.result> list);

        void showLoading();

        void stopLoading();

    }

    interface Presenter extends BasePresenter{

        void loadPosts();

        void refresh();

        void startReading(int position);

        void feelLucky();

    }

}
