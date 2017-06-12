package com.example.paperplane.license;

import com.example.paperplane.BasePresenter;
import com.example.paperplane.BaseView;

/**
 * Created by Administrator on 2017/6/7.
 */

public interface OpenSourceListenContract {

    interface View extends BaseView<Presenter> {

        void loadLicense(String path);

    }

    interface Presenter extends BasePresenter {

    }

}
