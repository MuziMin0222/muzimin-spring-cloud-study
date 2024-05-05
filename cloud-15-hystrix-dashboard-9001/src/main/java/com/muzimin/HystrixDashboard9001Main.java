package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author: 李煌民
 * @date: 2024-05-05 21:27
 * http://localhost:9001/hystrix  即可看到HystrixEurekaClient的dashboard
 **/
@SpringBootApplication
@EnableHystrixDashboard
@EnableEurekaClient
public class HystrixDashboard9001Main {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9001Main.class, args);
    }
}
