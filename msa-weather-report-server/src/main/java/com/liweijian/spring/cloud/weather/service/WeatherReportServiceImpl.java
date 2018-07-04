package com.liweijian.spring.cloud.weather.service;

import com.liweijian.spring.cloud.weather.vo.Forecast;
import com.liweijian.spring.cloud.weather.vo.Weather;
import com.liweijian.spring.cloud.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class WeatherReportServiceImpl implements WeatherReportService {


    @Override
    public Weather getWeatherDataByCityId(String cityId) {
        //TODO 由天气数据API微服务提供数据
        Weather data = new Weather();
        data.setAqi("81");
        data.setCity("深圳");
        data.setGanmao("容易感冒");
        data.setWendu("18");

        List<Forecast> forecastList = new ArrayList<>();
        Forecast forecast = new Forecast();
        forecast.setDate("29日星期天");
        forecast.setType("晴");
        forecast.setFengxiang("无凤");
        forecast.setHigh("11度");
        forecast.setLow("-1度");

        Forecast forecast1 = new Forecast();
        forecast1.setDate("28日星期天");
        forecast1.setType("晴");
        forecast1.setFengxiang("无凤");
        forecast1.setHigh("11度");
        forecast1.setLow("-1度");

        Forecast forecast2 = new Forecast();
        forecast2.setDate("27日星期天");
        forecast2.setType("晴");
        forecast2.setFengxiang("无凤");
        forecast2.setHigh("11度");
        forecast2.setLow("-1度");

        Forecast forecast3 = new Forecast();
        forecast3.setDate("26日星期天");
        forecast3.setType("晴");
        forecast3.setFengxiang("无凤");
        forecast3.setHigh("11度");
        forecast3.setLow("-1度");

        Forecast forecast4 = new Forecast();
        forecast4.setDate("25日星期天");
        forecast4.setType("晴");
        forecast4.setFengxiang("无凤");
        forecast4.setHigh("11度");
        forecast4.setLow("-1度");

        forecastList.add(forecast);
        forecastList.add(forecast1);
        forecastList.add(forecast2);
        forecastList.add(forecast3);
        forecastList.add(forecast4);

        data.setForecast(forecastList);
        return data;
    }
}
