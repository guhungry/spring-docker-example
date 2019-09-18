package com.guhungry.springdocker.demodocker.hello;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService service;

    @GetMapping("/ping")
    public String ping() {
        return service.getPong();
    }

    @Autowired
    private MeterRegistry meterRegistry;

    @GetMapping("/hi/{name}")
    public String hi(@PathVariable String name) {

        // Metric name = tracking.user
        Counter counter = meterRegistry.counter("tracking.user", "username", name);
        counter.increment();

        return "Hi, " + name;
    }
}
