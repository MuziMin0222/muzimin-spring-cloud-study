package com.muzimin.lb.impl;

import com.muzimin.lb.LoadBalance;
import org.springframework.cloud.client.ServiceInstance;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: 李煌民
 * @date: 2024-04-26 15:14
 **/
public class MyLoadBalance implements LoadBalance {
    private final AtomicInteger atomicInteger = new AtomicInteger(0);

    int getAndIncrement() {

        int current;
        int next = 0;

        do {
            current = atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        } while (!atomicInteger.compareAndSet(current, next));

        System.out.println(next + "次访问");

        return next;
    }

    //负载均衡算法：rest接口第几次请求数 % 服务器集群总数量 = 实际调用服务器位置下标， 每次服务重启动后rest接口计数从1开始。1
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {

        int index = getAndIncrement() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
