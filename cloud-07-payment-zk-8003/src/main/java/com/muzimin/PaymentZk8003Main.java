package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 李煌民
 * @date: 2024-04-26 11:04
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentZk8003Main {
    public static void main(String[] args) {
        SpringApplication.run(PaymentZk8003Main.class, args);
    }
}
