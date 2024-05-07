package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 李煌民
 * @date: 2024-05-07 21:23
 **/
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient3355Main {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3355Main.class, args);
    }
}
