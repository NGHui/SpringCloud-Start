package com.hui.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/12/5
 */
@EnableEurekaServer
@SpringBootApplication //EnableEurekaServer 服务端的启动类,可以提供别人注册
public class EurekaService_7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService_7002.class,args);
    }
}
