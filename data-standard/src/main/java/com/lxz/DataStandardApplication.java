package com.lxz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xlx
 * @desription:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class DataStandardApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataStandardApplication.class);
    }
}
