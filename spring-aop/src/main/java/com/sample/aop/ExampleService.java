package com.sample.aop;

import org.springframework.stereotype.Component;

@Component
public class ExampleService {

    @LogElapsedTime
    public void simulateSlowMethod() throws InterruptedException {
        Thread.sleep((int)(Math.random() * 1000));
    }
}
