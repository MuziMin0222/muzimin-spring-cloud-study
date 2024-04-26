package com.muzimin.controller;

import com.muzimin.entity.CommonResult;
import com.muzimin.entity.Payment;
import com.muzimin.lb.impl.MyLoadBalance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * @author: 李煌民
 * @date: 2024-04-25 20:37
 **/
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    // String BaseUrl = "http://localhost:8001";
    // 改成微服务名称，每次访问都去eureka中拿地址，就回轮训拿，达到负载均衡效果
    String BaseUrl = "http://CLOUD-01-PAYMENT";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/payment/get/{id}")
    CommonResult selecyById(@PathVariable("id") long id) {
        return restTemplate.getForObject(BaseUrl + "/payment/select/" + id, CommonResult.class);
    }

    @GetMapping("/payment2/get/{id}")
    CommonResult selectById2(@PathVariable("id") long id) {
        ResponseEntity<CommonResult> forEntity = restTemplate.getForEntity(BaseUrl + "/payment/select/" + id, CommonResult.class);
        if (forEntity.getStatusCode().is2xxSuccessful()) {
            log.info("数据获取成功");
            return forEntity.getBody();
        } else {
            return new CommonResult<>(400, "操作失败");
        }
    }

    @GetMapping("/payment/create")
    CommonResult createPayment(Payment payment) {
        return restTemplate.postForObject(BaseUrl + "/payment/insert", payment, CommonResult.class);
    }

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/testLB/{id}")
    String testSelfLB(@PathVariable("id") int id) {
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-01-PAYMENT");
        if (instances == null || instances.size() == 0) {
            return null;
        }

        for (ServiceInstance instance : instances) {
            URI uri = instance.getUri();
            System.out.println("能获取到的所有URI：" + uri);
        }

        MyLoadBalance loadBalance = new MyLoadBalance();
        ServiceInstance instance = loadBalance.instances(instances);
        String uri = instance.getUri().toString();
        System.out.println("uri: " + uri);

        String requestPath = uri + "/payment/select/" + id;
        System.out.println("调用的请求路径：" + requestPath);
        System.out.println(restTemplate.getClass().getName());
        return restTemplate.getForObject(requestPath, String.class);
    }
}
