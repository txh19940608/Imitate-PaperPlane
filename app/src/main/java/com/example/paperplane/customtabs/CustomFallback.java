package com.example.paperplane.customtabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

import com.example.paperplane.innerbrowser.InnerBrowserActivity;

/**
 * Created by Administrator on 2017/6/5.
 */
public class CustomFallback implements CustomTabActivityHelper.CustomTabFallback {

    @Override
    public void openUri(Activity activity, Uri uri) {
        activity.startActivity(new Intent(activity, InnerBrowserActivity.class).putExtra("url", uri.toString()));
    }

}
