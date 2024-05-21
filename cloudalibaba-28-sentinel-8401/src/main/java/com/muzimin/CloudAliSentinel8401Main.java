package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 李煌民
 * @date: 2024-05-15 21:52
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAliSentinel8401Main {
    public static void main(String[] args) {
        SpringApplication.run(CloudAliSentinel8401Main.class, args);
    }
}
