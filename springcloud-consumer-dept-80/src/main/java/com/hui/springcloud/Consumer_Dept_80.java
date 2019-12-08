package com.hui.springcloud;

import com.hui.myrule.HuiRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/12/5
 */
@SpringBootApplication
@EnableEurekaClient
//在微服务启动的是时候就会加载Ribbon的配置类,注册在springboot中
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT",configuration = HuiRule.class)
public class Consumer_Dept_80 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer_Dept_80.class,args);

    }
}
