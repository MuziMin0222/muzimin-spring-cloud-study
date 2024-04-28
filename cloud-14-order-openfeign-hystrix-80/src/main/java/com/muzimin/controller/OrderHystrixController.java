package com.muzimin.controller;

import com.muzimin.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author: 李煌民
 * @date: 2024-04-28 14:02
 **/
@RestController
@RequestMapping("/hystrix")
@DefaultProperties(defaultFallback = "globalHandler")// hystrix 全局fallback方法
public class OrderHystrixController {

    @Autowired
    PaymentHystrixService paymentHystrixService;

    @GetMapping("/order/ok")
    public String paymentServiceOk() {
        return paymentHystrixService.paymentServiceOk();
    }

    @GetMapping("/order/timeout")
    public String PaymentServiceTimeOut() {
        return paymentHystrixService.paymentServiceTimeOut();
    }

    @GetMapping("/timeout")
    // 指的是相应时间超过1.5s，则使用pymentHandler方法来处理请求
    @HystrixCommand(
            fallbackMethod = "pymentHandler",
            commandProperties = {@HystrixProperty(
                    name = "execution.isolation.thread.timeoutInMilliseconds",
                    value = "1500"
            )}
    )
    public String paymentServiceTimeOut() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        return "模拟消费端因请求超时而进行服务降级";
    }

    @GetMapping("/logic-error")
    //当请求的逻辑发生了错误时，也可以通过Hystrix进行服务降级
    @HystrixCommand(
            fallbackMethod = "pymentHandler",
            commandProperties = {@HystrixProperty(
                    name = "execution.isolation.thread.timeoutInMilliseconds",
                    value = "3000"
            )}
    )
    public String paymentServiceLogicError() {
        int i = 10 / 0;
        return "模拟消费端因逻辑错误而进行服务降级";
    }

    public String pymentHandler() {
        return "消费端这边繁忙或出错，请稍后重试😭";
    }

    @GetMapping("/global-fallback")
    //当请求的逻辑发生了错误时，也可以通过Hystrix进行服务降级
    @HystrixCommand
    public String paymentServiceGlobal() {
        int i = 10 / 0;
        return "模拟消费端因逻辑错误而进行服务降级--调用的是全局fallback方法";
    }

    String globalHandler() {
        return "全局FullBack方法，如果个别方法自定义fallback，采用就近原则";
    }
}
