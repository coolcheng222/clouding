package com.at.springcloud.ib;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author sealll
 * @time 2021/7/5 12:25
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
