package com.liweijian.spring.cloud.weather.service;

import com.liweijian.spring.cloud.weather.vo.WeatherResponse;

public interface WeatherDataService {

    WeatherResponse getWeatherDataByCityId(String cityId);
    WeatherResponse getWeatherDataByCityName(String cityName);
}
