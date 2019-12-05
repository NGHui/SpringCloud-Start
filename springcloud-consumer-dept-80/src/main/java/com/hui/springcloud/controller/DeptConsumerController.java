package com.hui.springcloud.controller;

import com.hui.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/12/5
 */
@RestController
public class DeptConsumerController {

    /*
     * 消费者只是负责调用服务端的接口,不应该有service层
     *
     * RestTemplate...提供我们直接调用,先注册在sping容器中
     *
     * (url,实体:map,class<T> restTemplate)
     * */

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate; //提供多种便捷访问远程http服务的方法,简单的festful服务的模板

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);

    }

}
