package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: 李煌民
 * @date: 2024-04-25 22:16
 **/
@SpringBootApplication
@EnableEurekaServer  // 设置为服务注册中心 EurekaServer
public class Eureka7001Main {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7001Main.class, args);
    }
}
