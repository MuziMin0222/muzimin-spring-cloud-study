package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 李煌民
 * @date: 2024-05-09 20:20
 **/
@SpringBootApplication
@EnableEurekaClient
public class CloudConfigClient3366Main {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClient3366Main.class, args);
    }
}
