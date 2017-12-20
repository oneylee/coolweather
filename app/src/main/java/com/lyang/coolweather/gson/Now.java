package com.lyang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lyang on 2017/12/11.
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
