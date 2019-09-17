package com.guhungry.springdocker.demodocker.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService service;

    @GetMapping("/ping")
    public String ping() {
        return service.getPong();
    }
}
