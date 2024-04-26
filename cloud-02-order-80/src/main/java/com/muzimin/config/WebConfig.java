package com.muzimin.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: 李煌民
 * @date: 2024-04-25 20:37
 **/
@Configuration
public class WebConfig {
    @Bean
    @LoadBalanced //开启负载均衡注解，指定算法，默认是轮询
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
