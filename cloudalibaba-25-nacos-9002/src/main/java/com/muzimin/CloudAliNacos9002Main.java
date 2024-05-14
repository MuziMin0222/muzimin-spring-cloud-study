package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 李煌民
 * @date: 2024-05-14 20:12
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAliNacos9002Main {
    public static void main(String[] args) {
        SpringApplication.run(CloudAliNacos9002Main.class, args);
    }
}
