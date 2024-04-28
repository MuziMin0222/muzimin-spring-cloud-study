package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: 李煌民
 * @date: 2024-04-28 13:58
 **/
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class OrderFeignHystrix80Main {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignHystrix80Main.class, args);
    }
}
