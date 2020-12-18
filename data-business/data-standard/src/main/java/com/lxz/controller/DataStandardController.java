package com.lxz.controller;

import com.lxz.service.MetaDataService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xlx
 * @desription:
 */
@RestController
@Slf4j
public class DataStandardController {

   @Autowired
   private MetaDataService metaDataService;

    @GetMapping("/getMetaData")
    public String getMetaData() {
        return metaDataService.getMetaData();
    }

    @GetMapping("/test/{id}")
    @HystrixCommand(fallbackMethod = "fallBack",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"), //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")//失败率
    })
    public String testHystrix(@PathVariable("id") Integer id){
        if(id < 0){
            throw new RuntimeException("id 不能小于0");
        }
        return "返回正确";
    }

    public String fallBack(Integer id){
        return "id 不能小于0";
    }


}
