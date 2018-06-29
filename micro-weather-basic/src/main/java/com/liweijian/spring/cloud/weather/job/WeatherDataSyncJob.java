package com.liweijian.spring.cloud.weather.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class WeatherDataSyncJob extends QuartzJobBean {

    private Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("【定时任务触发】");
    }
}
