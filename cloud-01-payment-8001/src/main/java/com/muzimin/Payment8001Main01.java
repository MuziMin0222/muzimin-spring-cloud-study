package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 李煌民
 * @date: 2024-04-25 18:52
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Payment8001Main01 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8001Main01.class, args);
    }
}
