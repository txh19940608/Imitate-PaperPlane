package com.example.paperplane.interfaze;

import com.android.volley.VolleyError;

/**
 * Created by Administrator on 2017/5/4.
 */

public interface OnStringListener {

    /**
     * 请求成功时回调
     * @param result
     */

    void onSuccess(String result);

    /**
     * 请求失败时回调
     * @param error
     */
    void onError(VolleyError error);
}
