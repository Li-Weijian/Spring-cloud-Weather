package com.liweijian.spring.cloud.weather.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.liweijian.spring.cloud.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class WeatherDataServiceImpl implements WeatherDataService {


    @Autowired
    private RestTemplate restTemplate;
    private static final String WEATHER_URI = "http://wthrcdn.etouch.cn/weather_mini?";
    //        http://wthrcdn.etouch.cn/weather_mini?city=深圳

    @Override
    public WeatherResponse getWeatherDataByCityId(String cityId) {
        String uri = WEATHER_URI+"citykey="+cityId;
        return doGetWeather(uri);
    }

    @Override
    public WeatherResponse getWeatherDataByCityName(String cityName) {
        String uri = WEATHER_URI + "city=" + cityName;
        return this.doGetWeather(uri);
    }

    /**
     * 获取天气响应对象
     * */
    private WeatherResponse doGetWeather(String uri){
        String body = null;
        WeatherResponse weatherResponse = null;
        ResponseEntity<String> respString = restTemplate.getForEntity(uri, String.class);

        if (respString.getStatusCodeValue() == 200){
            body = respString.getBody();
        }

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            weatherResponse = objectMapper.readValue(body, WeatherResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return weatherResponse;
    }
}
