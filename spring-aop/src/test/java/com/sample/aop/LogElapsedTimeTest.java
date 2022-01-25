package com.sample.aop;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LogElapsedTimeTest {

    @Autowired
    private ExampleService service;

    @Test
    public void validateLogElapsedTimeAnnotation() throws InterruptedException {
        service.simulateSlowMethod();
    }

}
