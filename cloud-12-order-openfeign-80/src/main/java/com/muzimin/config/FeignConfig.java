package com.muzimin.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 李煌民
 * @date: 2024-04-28 08:07
 **/
@Configuration
public class FeignConfig {
    /**
     * NONE,
     * BASIC,
     * HEADERS,
     * FULL;
     * <p>
     * 日志级别
     *
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
