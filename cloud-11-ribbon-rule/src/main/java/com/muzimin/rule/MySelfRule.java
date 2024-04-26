package com.muzimin.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 李煌民
 * @date: 2024-04-26 14:43
 * 该类是ribbon的自定义策略
 **/
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        // 此处将ribbon默认使用的轮询策略改为随机策略
        return new RandomRule();
    }
}
