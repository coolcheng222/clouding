package com.at.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sealll
 * @time 2021/6/19 16:58
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule rule(){
        return new RandomRule();
    }
}
