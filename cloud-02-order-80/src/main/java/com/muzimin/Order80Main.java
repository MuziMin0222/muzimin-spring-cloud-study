package com.muzimin;

import com.muzimin.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author: 李煌民
 * @date: 2024-04-25 20:36
 **/
@SpringBootApplication
@EnableEurekaClient
// 启动该服务时去加载自定义的ribbon配置
//@RibbonClient(name = "CLOUD-01-PAYMENT", configuration = MySelfRule.class)
public class Order80Main {
    public static void main(String[] args) {
        SpringApplication.run(Order80Main.class, args);
    }
}
