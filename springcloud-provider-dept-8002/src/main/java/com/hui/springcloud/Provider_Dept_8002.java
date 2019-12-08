package com.hui.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/12/5
 */
@SpringBootApplication
@EnableEurekaClient //开启客户端服务
@EnableDiscoveryClient //服务发现
public class Provider_Dept_8002 {
    public static void main(String[] args) {
        SpringApplication.run(Provider_Dept_8002.class,args);
    }
}
