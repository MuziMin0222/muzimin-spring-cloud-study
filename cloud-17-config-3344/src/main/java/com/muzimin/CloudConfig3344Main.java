package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 李煌民
 * @date: 2024-05-07 20:51
 **/
@SpringBootApplication
@EnableEurekaClient
public class CloudConfig3344Main {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfig3344Main.class, args);
    }
}
