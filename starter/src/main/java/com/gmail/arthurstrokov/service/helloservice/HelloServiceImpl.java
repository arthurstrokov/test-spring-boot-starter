package com.gmail.arthurstrokov.service.helloservice;

//Impl Service
public class HelloServiceImpl implements HelloService {

    @Override
    public void hello() {
        System.out.println("Hello from the hello service impl");
    }
}
