package com.example.paperplane.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.paperplane.R;
import com.example.paperplane.homepage.DoubanMomentFragment;
import com.example.paperplane.homepage.GuokrFragment;
import com.example.paperplane.homepage.ZhihuDailyFragment;

/**
 * Created by Administrator on 2017/5/11.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {

    private String[] titles;
    private final Context context;

    private GuokrFragment guokrFragment;
    private ZhihuDailyFragment zhihuFragment;
    private DoubanMomentFragment doubanFragment;

    public GuokrFragment getGuokrFragment() {
        return guokrFragment;
    }

    public ZhihuDailyFragment getZhihuFragment() {
        return zhihuFragment;
    }

    public DoubanMomentFragment getDoubanFragment() {
        return doubanFragment;
    }

    public MainPagerAdapter(FragmentManager fm,
                            Context context,
                            ZhihuDailyFragment zhihuDailyFragment,
                            GuokrFragment guokrFragment,
                            DoubanMomentFragment doubanMomentFragment) {
        super(fm);
        this.context = context;
        titles = new String[] {
                context.getResources().getString(R.string.zhihu_daily),
                context.getResources().getString(R.string.guokr_handpick),
                context.getResources().getString(R.string.douban_moment)
        };

        this.zhihuFragment = zhihuDailyFragment;
        this.guokrFragment = guokrFragment;
        this.doubanFragment = doubanMomentFragment;

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1){
            return guokrFragment;
        } else if (position == 2){
            return doubanFragment;
        }

        return zhihuFragment;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

}
