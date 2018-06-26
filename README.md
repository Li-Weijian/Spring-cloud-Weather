#  基于Spring Cloud的微服务实战 - 天气预报

## 项目所涉及到的技术及相关版本如下

本项目所采用的技术及相关版本较新，请需要学习的朋友将相关开发环境设置成跟本项目所采用的一致，或者不低于本项目的配置。

* JDK 8
* IntelliJ IDEA：项目采用IntelliJ IDEA编写，但示例源码与具体的IDE无关，各位朋友可以自行选择适合自己的IDE，比如Eclipse、NetBeans等。
* Maven 3.3.9
* Spring Boot 2.0.3.RELEASE
* Spring Boot Web Starter 2.0.0.M4
* Apache HttpClient 4.5.3
* Spring Boot Data Redis Starter 2.0.0.M4
* Redis 3.2.100
* Spring Boot Quartz Starter 2.0.0.M4
* Quartz Scheduler 2.3.0
* Spring Boot Thymeleaf Starter 2.0.0.M4
* Thymeleaf 3.0.7.RELEASE
* Bootstrap 4.0.0-beta.2
* Spring Cloud Starter Netflix Eureka Server Finchley.M2
* Spring Cloud Starter Netflix Eureka Client Finchley.M2
* Spring Cloud Starter Netflix Ribbon Finchley.M2
* Spring Cloud Starter OpenFeign Finchley.M2
* Spring Cloud Starter Netflix Zuul Finchley.M2
* Spring Cloud Config Server Finchley.M2
* Spring Cloud Config Client Finchley.M2
* Spring Cloud Starter Netflix Hystrix Finchley.M2

## 示例源码

以下为教程中所涉及的示例源码：

* 从一个天气预报系统讲起 `micro-weather-basic`
* 使用Redis提升应用的并发访问能力 `micro-weather-redis`
* 实现天气数据的同步`micro-weather-quartz`
* 给天气预报一个“面子”`micro-weather-report`
* 天气数据采集微服务的实现`msa-weather-collection-server`
* 天气数据API微服务的实现`msa-weather-data-server`
* 天气预报微服务的实现`msa-weather-report-server`
* 城市数据API微服务的实现`msa-weather-city-server`
* 如何集成 Eureka Server`micro-weather-eureka-server`
* 如何集成 Eureka Client`micro-weather-eureka-client`
* 实现服务的注册与发现`msa-weather-collection-eureka`、`msa-weather-data-eureka`、`msa-weather-city-eureka`、`msa-weather-report-eureka`
* 常见微服务的消费者`micro-weather-eureka-client-feign`
* 使用 Feign 实现服务的消费者`msa-weather-collection-eureka-feign`、`msa-weather-report-eureka-feign`
* 如何集成Zuul`micro-weather-eureka-client-zuul`
* 实现 API 网关`msa-weather-report-eureka-feign-gateway`、`msa-weather-eureka-client-zuul`
* 使用 Config 实现的配置中心`micro-weather-config-server`、`micro-weather-config-client`
* 如何集成 Hystrix`micro-weather-eureka-client-feign-hystrix`
* 实现微服务的熔断机制`msa-weather-report-eureka-feign-gateway-hystrix`



### 各位路过的朋友点个star 再走呗，在此感激不尽。