package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 李煌民
 * @date: 2024-04-26 13:06
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OderZk80Main {
    public static void main(String[] args) {
        SpringApplication.run(OderZk80Main.class, args);
    }
}
