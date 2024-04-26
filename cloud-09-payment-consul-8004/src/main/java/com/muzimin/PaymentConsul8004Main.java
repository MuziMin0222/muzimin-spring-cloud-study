package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 李煌民
 * @date: 2024-04-26 13:40
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsul8004Main {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsul8004Main.class, args);
    }
}
