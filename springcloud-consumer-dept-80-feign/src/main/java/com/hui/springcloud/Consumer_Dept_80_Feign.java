package com.hui.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/12/5
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.hui.springcloud"})
@ComponentScan("com.hui.springcloud")
public class Consumer_Dept_80_Feign {
    public static void main(String[] args) {
        SpringApplication.run(Consumer_Dept_80_Feign.class,args);
    }
}
