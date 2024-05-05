package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author: 李煌民
 * @date: 2024-04-28 13:29
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix // 启动 hystrix
//注解开启断路器功能
@EnableCircuitBreaker
public class PaymentHystrix8001Main {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrix8001Main.class, args);
    }
}
