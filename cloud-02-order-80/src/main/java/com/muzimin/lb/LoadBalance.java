package com.muzimin.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author: 李煌民
 * @date: 2024-04-26 15:14
 * 自定义负载均衡接口
 **/
public interface LoadBalance {
    /**
     * 收集服务器总共有多少台能够提供服务的机器，并放到list里面
     *
     * @param serviceInstances
     * @return ServiceInstance
     * @author lixiaolong
     * @date 2020/12/23 9:24
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
