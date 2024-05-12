package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 李煌民
 * @date: 2024-05-10 21:03
 **/
@SpringBootApplication
@EnableEurekaClient
public class Cloud21StreamProducer8801 {
    public static void main(String[] args) {
        SpringApplication.run(Cloud21StreamProducer8801.class, args);
    }
}
