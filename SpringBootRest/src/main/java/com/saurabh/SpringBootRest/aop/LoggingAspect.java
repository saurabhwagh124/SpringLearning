package com.saurabh.SpringBootRest.aop;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger Logger = LoggerFactory.getLogger(LoggingAspect.class);

    // return type, class-name.method-name, args

    @Before("execution(* com.saurabh.SpringBootRest.service.JobService.*(..))")
    public void logMethodCall(JoinPoint jp){
        Logger.info("Method called  ->" + jp.getSignature().getName());
    }

    @After("execution(* com.saurabh.SpringBootRest.service.JobService.*(..))")
    public void logMethodExecuted(JoinPoint jp){
        Logger.info("Method Executed  ->" + jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.saurabh.SpringBootRest.service.JobService.*(..))")
    public void logMethodCrash(JoinPoint jp){
        Logger.info("Method Crashed  ->" + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.saurabh.SpringBootRest.service.JobService.*(..))")
    public void logMethodSuccess(JoinPoint jp){
        Logger.info("Method Executed Successfully  ->" + jp.getSignature().getName());
    }
}
