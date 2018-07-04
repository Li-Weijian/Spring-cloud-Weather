package com.liweijian.spring.cloud.weather.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.liweijian.spring.cloud.weather.vo.WeatherResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Service
public class WeatherDataServiceImpl implements WeatherDataService {


    @Autowired
    private StringRedisTemplate redisTemplate;

    private static final String WEATHER_URI = "http://wthrcdn.etouch.cn/weather_mini?";
    private Logger logger = LoggerFactory.getLogger(WeatherDataServiceImpl.class);

    @Override
    public WeatherResponse getWeatherDataByCityId(String cityId) {
        String uri = WEATHER_URI + "citykey=" + cityId;
        return doGetWeather(uri);
    }

    @Override
    public WeatherResponse getWeatherDataByCityName(String cityName) {
        String uri = WEATHER_URI + "city=" + cityName;
        return this.doGetWeather(uri);
    }

    /**
     * 获取天气响应对象
     */
    private WeatherResponse doGetWeather(String uri) {
        String key = uri;
        String body = null;
        WeatherResponse weatherResponse = null;
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ObjectMapper objectMapper = new ObjectMapper();

        //先查询redis中有没有缓存
        if (redisTemplate.hasKey(key)) {
            logger.info("【缓存】redis has key");
            body = ops.get(key);
        } else {
            //否则，抛出异常
            throw new RuntimeException("redis don't has data");
        }

        try {
            //将字符串转换成对象
            weatherResponse = objectMapper.readValue(body, WeatherResponse.class);
        } catch (IOException e) {
            logger.error("error", e);
        }

        return weatherResponse;
    }
}
