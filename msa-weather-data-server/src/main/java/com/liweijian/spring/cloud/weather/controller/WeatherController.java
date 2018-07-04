package com.liweijian.spring.cloud.weather.controller;

import com.liweijian.spring.cloud.weather.service.WeatherDataService;
import com.liweijian.spring.cloud.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherDataService weatherDataService;

    @GetMapping("/cityId/{cityId}")
    public WeatherResponse getWeatherDataByCityId(@PathVariable("cityId") String cityId){
        WeatherResponse response = weatherDataService.getWeatherDataByCityId(cityId);
        return response;
    }

    @GetMapping("/cityName/{cityName}")
    public WeatherResponse getWeatherDataByCityName(@PathVariable("cityName") String cityName) {
        WeatherResponse response = weatherDataService.getWeatherDataByCityName(cityName);
        return response;
    }




}
