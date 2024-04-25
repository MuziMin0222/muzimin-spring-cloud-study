package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 李煌民
 * @date: 2024-04-25 20:36
 **/
@SpringBootApplication
@EnableEurekaClient
public class Order80Main {
    public static void main(String[] args) {
        SpringApplication.run(Order80Main.class, args);
    }
}
