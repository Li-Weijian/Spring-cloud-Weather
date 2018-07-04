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
public class Forecast implements Serializable {

    private String date;
    private String high;
    private String fengli;
    private String low;
    private String fengxiang;
    private String type;
    public void setDate(String date) {
         this.date = date;
     }
     public String getDate() {
         return date;
     }

    public void setHigh(String high) {
         this.high = high;
     }
     public String getHigh() {
         return high;
     }

    public void setFengli(String fengli) {
         this.fengli = fengli;
     }
     public String getFengli() {
         return fengli;
     }

    public void setLow(String low) {
         this.low = low;
     }
     public String getLow() {
         return low;
     }

    public void setFengxiang(String fengxiang) {
         this.fengxiang = fengxiang;
     }
     public String getFengxiang() {
         return fengxiang;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

}