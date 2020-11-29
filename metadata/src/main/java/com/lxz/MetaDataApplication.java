package com.lxz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xlx
 * @desription:
 */
@SpringBootApplication
@EnableEurekaClient
public class MetaDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetaDataApplication.class);
    }

}
