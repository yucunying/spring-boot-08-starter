package com.ycytest.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author yu.cunying
 * @Date 2022/9/7
 */
@Configuration
@EnableConfigurationProperties(HelloProperties.class)
@ConditionalOnWebApplication// web 应用才生效
public class HelloAutoConfiguration {


//    @Autowired
//    HelloProperties helloProperties;

    @Bean
    public HelloService helloService(HelloProperties helloProperties){
        HelloService helloService = new HelloService();
        helloService.setHelloProperties(helloProperties);
        return helloService;
    }
}
