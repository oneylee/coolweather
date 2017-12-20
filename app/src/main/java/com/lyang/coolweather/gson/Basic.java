package com.lyang.coolweather.gson;


import com.google.gson.annotations.SerializedName;

/**
 * Created by lyang on 2017/12/11.
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weathreId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }


}
