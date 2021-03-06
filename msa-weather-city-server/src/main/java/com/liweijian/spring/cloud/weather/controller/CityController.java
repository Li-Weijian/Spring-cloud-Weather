package com.liweijian.spring.cloud.weather.controller;

import com.liweijian.spring.cloud.weather.service.CityDataService;
import com.liweijian.spring.cloud.weather.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/citys")
public class CityController {

    @Autowired
    private CityDataService cityDataService;


    @GetMapping("/list")
    public List<City> listCity() throws Exception {

        return cityDataService.listCity();
    }
}
