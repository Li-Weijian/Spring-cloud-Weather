package com.liweijian.spring.cloud.weather.controller;

import com.liweijian.spring.cloud.weather.service.WeatherReportService;
import com.liweijian.spring.cloud.weather.vo.City;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/report")
public class WeatherReportController {

    @Autowired
    private WeatherReportService reportService;

    private Logger logger = LoggerFactory.getLogger(WeatherReportController.class);


    @GetMapping("/cityId/{cityId}")
    public ModelAndView getWeatherDataByCityId(@PathVariable("cityId") String cityId, Model model) throws Exception {
        //TODO 改为城市数据API服务来提供数据
        //TODO 后期根据城市数据API进行调用
        List<City> cityList = null;

        try {
            //TODO 后期根据城市数据API进行调用
            cityList = new ArrayList<>();
            City city = new City();
            city.setCityId("101280101");
            city.setCityName("深圳");
            cityList.add(city);
        } catch (Exception e) {
            logger.error("exception!",e);
        }

        model.addAttribute("title","Liweijian - 天气预报");
        model.addAttribute("cityId",cityId);
        model.addAttribute("cityList", cityList);
        model.addAttribute("report", reportService.getWeatherDataByCityId(cityId));
        return new ModelAndView("weather/report", "reportModel", model);
    }


}
