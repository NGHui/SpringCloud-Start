package com.hui.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/12/5
 */
@Configuration
public class ConfigBean {

    //配置负载均衡实现 RestTemplate
    //IRule
    //AvailabilityFilteringRule: 会先过滤掉跳闸的服务,访问故障的服务.
    //RoundRobinRule: 负载均衡轮询算法,也是默认负载均衡的算法
    //RandomRule:随机负载均衡算法
    //RetryRule:轮询算法,但是会重新连接
    @Bean
    @LoadBalanced //Ribbon 负载均衡注解
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    //使用随机算法,负载均衡
   /* @Bean
    public IRule myRule(){
        return new RandomRule();
    }*/
}
