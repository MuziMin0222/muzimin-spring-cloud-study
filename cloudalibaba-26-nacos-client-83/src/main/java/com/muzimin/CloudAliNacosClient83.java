package com.muzimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 李煌民
 * @date: 2024-05-14 21:06
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAliNacosClient83 {
    public static void main(String[] args) {
        SpringApplication.run(CloudAliNacosClient83.class, args);
    }
}
