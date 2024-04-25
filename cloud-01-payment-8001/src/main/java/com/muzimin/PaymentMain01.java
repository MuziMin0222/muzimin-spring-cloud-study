package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 李煌民
 * @date: 2024-04-25 18:52
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain01 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain01.class, args);
    }
}
