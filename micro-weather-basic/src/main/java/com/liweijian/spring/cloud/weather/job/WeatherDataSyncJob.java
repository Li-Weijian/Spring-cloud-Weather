package com.liweijian.spring.cloud.weather.job;

import com.liweijian.spring.cloud.weather.service.CityDataService;
import com.liweijian.spring.cloud.weather.service.WeatherDataService;
import com.liweijian.spring.cloud.weather.vo.City;
import com.liweijian.spring.cloud.weather.vo.CityList;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;

public class WeatherDataSyncJob extends QuartzJobBean {

    @Autowired
    private CityDataService cityDataService;
    @Autowired
    private WeatherDataService weatherDataService;

    private Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        List<City> cityList = null;

        try {
            cityList = cityDataService.listCity();
        } catch (Exception e) {
            logger.error("exception!",e);
        }

        logger.info("【写入缓存】开始缓存");
        for (City city: cityList) {
            String cityId = city.getCityId();
            logger.info("【写入缓存】cityId = " + cityId);
            weatherDataService.syncDataByCityId(cityId);
        }
        logger.info("【写入缓存】缓存结束");
    }
}
