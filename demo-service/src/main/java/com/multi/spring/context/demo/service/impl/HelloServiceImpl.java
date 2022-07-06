package com.multi.spring.context.demo.service.impl;

import com.multi.spring.context.demo.client.HelloService;
import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "hello world";
    }
}
