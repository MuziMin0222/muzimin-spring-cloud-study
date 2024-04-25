package com.muzimin.config;

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
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
