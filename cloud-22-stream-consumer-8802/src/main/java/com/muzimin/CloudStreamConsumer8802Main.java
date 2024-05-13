package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 李煌民
 * @date: 2024-05-13 21:34
 **/
@SpringBootApplication
@EnableEurekaClient
public class CloudStreamConsumer8802Main {
    public static void main(String[] args) {
        SpringApplication.run(CloudStreamConsumer8802Main.class,args);
    }
}
