package com.liweijian.spring.cloud.weather.service;

import com.liweijian.spring.cloud.weather.utils.XmlBuilder;
import com.liweijian.spring.cloud.weather.vo.City;
import com.liweijian.spring.cloud.weather.vo.CityList;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

@Service
public class CityDataServiceImpl implements CityDataService {


    /**
     * 获取城市列表对象
     * */
    @Override
    public List<City> listCity() throws Exception {

        Resource resource = new ClassPathResource("citylist.xml");
        BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream()));

        StringBuffer buffer = new StringBuffer();
        String line = "";

        while ((line = br.readLine()) != null){
            buffer.append(line);
        }

        br.close();

        CityList cityList = (CityList) XmlBuilder.xmlStrToObject(CityList.class, buffer.toString());
        return cityList.getCityList();
    }
}
