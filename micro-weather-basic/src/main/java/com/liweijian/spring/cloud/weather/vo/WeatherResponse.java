/**
  * Copyright 2018 bejson.com 
  */
package com.liweijian.spring.cloud.weather.vo;

import java.io.Serializable;

/**
 * Auto-generated: 2018-06-26 17:52:54
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class WeatherResponse implements Serializable {

    private Weather data;
    private int status;
    private String desc;

    public Weather getData() {
        return data;
    }

    public void setData(Weather data) {
        this.data = data;
    }

    public void setStatus(int status) {
         this.status = status;
     }
     public int getStatus() {
         return status;
     }

    public void setDesc(String desc) {
         this.desc = desc;
     }
     public String getDesc() {
         return desc;
     }

}