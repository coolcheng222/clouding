package com.at.springcloud;

import com.at.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author sealll
 * @time 2021/5/9 22:09
 */
@EnableEurekaClient
//@RibbonClient(name="CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
@SpringBootApplication
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class);
    }
}
