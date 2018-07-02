package com.liweijian.spring.cloud.weather.service;

import com.liweijian.spring.cloud.weather.vo.Weather;
import com.liweijian.spring.cloud.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WeatherReportServiceImpl implements WeatherReportService {
    @Autowired
    private WeatherDataService weatherDataService;

    @Override
    public Weather getWeatherDataByCityId(String cityId) {
        WeatherResponse weatherResponse = weatherDataService.getWeatherDataByCityId(cityId);
        return weatherResponse.getData();
    }
}
