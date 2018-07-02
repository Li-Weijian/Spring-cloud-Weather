package com.liweijian.spring.cloud.weather.controller;

import com.liweijian.spring.cloud.weather.service.CityDataService;
import com.liweijian.spring.cloud.weather.service.WeatherReportService;
import com.liweijian.spring.cloud.weather.vo.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/report")
public class WeatherReportController {

    @Autowired
    private WeatherReportService reportService;

    @Autowired
    private CityDataService cityDataService;

    @GetMapping("/cityId/{cityId}")
    public ModelAndView getWeatherDataByCityId(@PathVariable("cityId") String cityId, Model model) throws Exception {
        model.addAttribute("title","Liweijian - 天气预报");
        model.addAttribute("cityId",cityId);
        model.addAttribute("cityList", cityDataService.listCity());
        model.addAttribute("report", reportService.getWeatherDataByCityId(cityId));
        return new ModelAndView("weather/report", "reportModel", model);
    }


}
