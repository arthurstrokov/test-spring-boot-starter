package com.gmail.arthurstrokov.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StarterConfiguration {

    @Bean
    public StarterListener starterListener() {
        return new StarterListener();
    }
}
