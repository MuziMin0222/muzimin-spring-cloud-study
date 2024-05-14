package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 李煌民
 * @date: 2024-05-14 20:07
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAliNacos9001Main {
    public static void main(String[] args) {
        SpringApplication.run(CloudAliNacos9001Main.class, args);
    }
}
