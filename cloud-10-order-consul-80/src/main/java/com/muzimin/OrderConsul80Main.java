package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 李煌民
 * @date: 2024-04-26 13:54
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsul80Main {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsul80Main.class, args);
    }
}
