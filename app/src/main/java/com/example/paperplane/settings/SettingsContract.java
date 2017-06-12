package com.example.paperplane.settings;

import android.preference.Preference;

import com.example.paperplane.BasePresenter;
import com.example.paperplane.BaseView;

/**
 * Created by Administrator on 2017/6/3.
 */

public interface SettingsContract {

    interface View extends BaseView<Presenter> {

        void showCleanGlideCacheDone();

    }

    interface Presenter extends BasePresenter {

        void setNoPictureMode(android.support.v7.preference.Preference preference);

        void setInAppBrowser(android.support.v7.preference.Preference preference);

        void cleanGlideCache();

        void setTimeOfSavingArticles(android.support.v7.preference.Preference preference, Object newValue);

        String getTimeSummary();

    }

}
