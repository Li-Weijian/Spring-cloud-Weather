package com.liweijian.spring.cloud.weather.service;

public interface WeatherDataCollectionService {

    /**
     * 根据城市id同步天气数据
     * */
    void sysncDataByCityId(String cityId);


}
