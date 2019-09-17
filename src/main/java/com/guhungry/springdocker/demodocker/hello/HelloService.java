package com.guhungry.springdocker.demodocker.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String getPong() {
        return "pong";
    }
}
