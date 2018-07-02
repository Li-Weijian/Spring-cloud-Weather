package com.liweijian.spring.cloud.weather.service;

import com.liweijian.spring.cloud.weather.vo.Weather;

public interface WeatherReportService {

    Weather getWeatherDataByCityId(String cityId);




}
