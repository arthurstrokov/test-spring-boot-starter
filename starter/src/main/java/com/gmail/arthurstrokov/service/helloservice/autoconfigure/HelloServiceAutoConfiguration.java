package com.gmail.arthurstrokov.service.helloservice.autoconfigure;

import com.gmail.arthurstrokov.service.helloservice.HelloService;
import com.gmail.arthurstrokov.service.helloservice.HelloServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(HelloService.class)
public class HelloServiceAutoConfiguration {

    //conditional bean creation
    @Bean
    @ConditionalOnMissingBean
    public HelloService helloService(){
        return new HelloServiceImpl();
    }
}
