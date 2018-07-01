package com.liweijian.spring.cloud.weather.service;

import com.liweijian.spring.cloud.weather.vo.City;

import java.util.List;

public interface CityDataService {

    List<City> listCity() throws Exception;
}
