package com.lyang.coolweather.util;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Created by lyang on 2017/12/10.
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
