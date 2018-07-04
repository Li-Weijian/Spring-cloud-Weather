package com.liweijian.spring.cloud.weather.job;

import com.liweijian.spring.cloud.weather.service.WeatherDataCollectionService;
import com.liweijian.spring.cloud.weather.vo.City;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSyncJob extends QuartzJobBean {

    @Autowired
    private WeatherDataCollectionService weatherDataCollectionService;

    private Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) {
        //TODO 后期根据城市数据API进行调用
        List<City> cityList = null;

        try {
            //TODO 后期根据城市数据API进行调用
            cityList = new ArrayList<>();
            City city = new City();
            city.setCityId("101280101");
            cityList.add(city);
        } catch (Exception e) {
            logger.error("exception!",e);
        }

        logger.info("【写入缓存】开始缓存");
        for (City city: cityList) {
            String cityId = city.getCityId();
            logger.info("【写入缓存】cityId = " + cityId);
            weatherDataCollectionService.sysncDataByCityId(cityId);
        }
        logger.info("【写入缓存】缓存结束");
    }
}
