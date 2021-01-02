package com.lxz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xlx
 * @desription:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MetaDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetaDataApplication.class);
    }

}
