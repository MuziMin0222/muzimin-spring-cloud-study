package com.muzimin.controller;

import com.muzimin.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 李煌民
 * @date: 2024-04-28 13:31
 **/
@RestController
@RequestMapping("/hystrix")
@Slf4j
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @GetMapping("/ok")
    public String paymentServiceOk() {
        log.info("调用8001paymentServiceOk服务");
        return paymentService.paymentServiceOk();
    }

    @GetMapping("/timeout")
    // 指的是相应时间超过5s，则使用pymentHandler方法来处理请求
    @HystrixCommand(
            fallbackMethod = "pymentHandler",
            commandProperties = {@HystrixProperty(
                    name = "execution.isolation.thread.timeoutInMilliseconds",
                    value = "3000"
            )}
    )
    public String paymentServiceTimeOut() {
        log.info("调用8001paymentServiceTimeOut服务");
        return paymentService.paymentServiceTimeOut();
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
        return paymentService.paymentServiceTimeOut();
    }

    public String pymentHandler() {
        return "服务器繁忙或出错，请稍后重试😭";
    }
}
