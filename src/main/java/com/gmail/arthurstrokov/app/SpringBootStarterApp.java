package com.gmail.arthurstrokov.app;

import com.gmail.arthurstrokov.service.helloservice.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringBootStarterApp {
    private final HelloService helloService;
    private final AppService appService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarterApp.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            helloService.hello();
            appService.appMethod();
        };
    }
}
