package com.liweijian.spring.cloud.weather.utils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.Reader;
import java.io.StringReader;

public class XmlBuilder {

    /**
     * 将xml字符转换成对象
     * */
    public static Object xmlStrToObject(Class<?> clazz, String xmlStr) throws Exception{

        Object xmlObject = null;
        Reader reader = null;
        JAXBContext context = JAXBContext.newInstance(clazz);

        Unmarshaller unmarshaller = context.createUnmarshaller();

        reader = new StringReader(xmlStr);
        xmlObject = unmarshaller.unmarshal(reader);

        if (null != reader){
            reader.close();
        }
        return xmlObject;
    }
}
