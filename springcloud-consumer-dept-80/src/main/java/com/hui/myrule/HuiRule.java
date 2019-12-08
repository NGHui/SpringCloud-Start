package com.hui.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/12/7
 */
@Configuration
public class HuiRule {

    @Bean
    public IRule myRule(){
        return new HuiRandomRule();
    }

}
