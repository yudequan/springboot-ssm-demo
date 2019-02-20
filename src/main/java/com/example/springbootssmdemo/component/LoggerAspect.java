package com.example.springbootssmdemo.component;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
    @Pointcut("execution(* com.example.springbootssmdemo.service.*.*(..))")
    private void loggingOperation() {}

    @Before("loggingOperation()")
    public void logBefore() {
        System.out.println("办理贷款之前记录日志");
    }
}
