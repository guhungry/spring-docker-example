package com.guhungry.springdocker.demodocker.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
