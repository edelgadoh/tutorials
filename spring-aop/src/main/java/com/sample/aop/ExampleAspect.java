package com.sample.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ExampleAspect {

    @Around("@annotation(com.sample.aop.LogElapsedTime)")
    public Object logElapsedTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        log.info(String.format("%s took %d ms", joinPoint.getSignature(), System.currentTimeMillis() - startTime));
        return proceed;
    }

}
