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
public class Yesterday implements Serializable {

    private String date;
    private String high;
    private String fx;
    private String low;
    private String fl;
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

    public void setFx(String fx) {
         this.fx = fx;
     }
     public String getFx() {
         return fx;
     }

    public void setLow(String low) {
         this.low = low;
     }
     public String getLow() {
         return low;
     }

    public void setFl(String fl) {
         this.fl = fl;
     }
     public String getFl() {
         return fl;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

}