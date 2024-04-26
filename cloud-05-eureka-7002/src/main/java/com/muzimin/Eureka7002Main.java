package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: 李煌民
 * @date: 2024-04-26 07:58
 **/
@SpringBootApplication
@EnableEurekaServer
public class Eureka7002Main {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7002Main.class, args);
    }
}
