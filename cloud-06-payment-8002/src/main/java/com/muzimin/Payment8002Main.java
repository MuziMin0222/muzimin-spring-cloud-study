package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 李煌民
 * @date: 2024-04-26 09:28
 **/
@SpringBootApplication
@EnableEurekaClient
public class Payment8002Main {
    public static void main(String[] args) {
        SpringApplication.run(Payment8002Main.class, args);
    }
}
