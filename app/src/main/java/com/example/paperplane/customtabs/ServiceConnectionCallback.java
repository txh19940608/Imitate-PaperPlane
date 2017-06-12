package com.example.paperplane.customtabs;

import android.support.customtabs.CustomTabsClient;

/**
 * Created by Administrator on 2017/6/4.
 */

public interface ServiceConnectionCallback {

    /**
     * Called when the service is connected.
     * @param client a CustomTabsClient
     */
    void onServiceConnected(CustomTabsClient client);

    /**
     * Called when the service is disconnected.
     */
    void onServiceDisconnected();

}
