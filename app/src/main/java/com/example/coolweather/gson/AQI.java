package com.example.coolweather.gson;

/**
 * Created by zyn on 2017/11/29.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
