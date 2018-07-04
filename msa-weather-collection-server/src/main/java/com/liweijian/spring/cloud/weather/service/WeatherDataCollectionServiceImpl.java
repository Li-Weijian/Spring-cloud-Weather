package com.liweijian.spring.cloud.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

@Service
public class WeatherDataCollectionServiceImpl implements  WeatherDataCollectionService {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private StringRedisTemplate redisTemplate;

    private static final long TIMEOUT = 1800; //redis缓存过期时间
    private static final String WEATHER_URI = "http://wthrcdn.etouch.cn/weather_mini?";

    @Override
    public void sysncDataByCityId(String cityId) {
        String uri = WEATHER_URI + "citykey=" + cityId;
        this.saveWeatherData(uri);
    }

    /**
     * 查询出所有的城市，写入缓存中
     * */
    private void saveWeatherData(String uri) {
        String key = uri;
        String body = null;
        ValueOperations<String, String> ops = redisTemplate.opsForValue();

        //调用接口获取数据
        ResponseEntity<String> respString = restTemplate.getForEntity(uri, String.class);

        if (respString.getStatusCodeValue() == 200) {
            body = respString.getBody();
        }
        //写入缓存
        ops.set(key, body, TIMEOUT, TimeUnit.SECONDS);
    }
}
