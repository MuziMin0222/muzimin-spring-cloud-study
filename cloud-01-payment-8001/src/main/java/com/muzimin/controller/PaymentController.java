package com.muzimin.controller;

import com.muzimin.entity.CommonResult;
import com.muzimin.entity.Payment;
import com.muzimin.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author: 李煌民
 * @date: 2024-04-25 19:05
 **/
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Resource
    PaymentService paymentService;

    @Value("${server.port}")
    String port;

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/discover")
    Object discoverServer() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            List<ServiceInstance> instances = discoveryClient.getInstances(service);
            for (ServiceInstance instance : instances) {
                log.info("{} \t {} \t {} \t {} \t {}", instance.getInstanceId(), instance.getHost(), instance.getPort(), instance.getUri(), instance.getServiceId());
            }
        }
        return discoveryClient;
    }

    @PostMapping("/insert")
    CommonResult<Payment> insertData(@RequestBody Payment payment) {
        int i = paymentService.insertPayment(payment);
        if (i > 0) {
            return new CommonResult<>(200, "数据插入成功,port:" + port, payment);
        } else {
            return new CommonResult<>(400, "数据插入失败,port:" + port, payment);
        }
    }

    @GetMapping("/select/{id}")
    CommonResult<Payment> selectData(@PathVariable("id") int id) {
        Payment payment = paymentService.selectPaymentById(id);
        if (payment != null) {
            return new CommonResult<>(200, "数据查询成功,port:" + port, payment);
        } else {
            return new CommonResult<Payment>(400, "数据查询失败,port:" + port);
        }
    }

    @GetMapping("/timeout")
    CommonResult<String> timeOutTest() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new CommonResult<String>(200, port);
    }
}
