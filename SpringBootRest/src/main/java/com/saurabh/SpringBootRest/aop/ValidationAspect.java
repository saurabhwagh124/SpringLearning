package com.saurabh.SpringBootRest.aop;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {

    public static final Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);


    @Around("execution(* com.saurabh.SpringBootRest.service.JobService.*(..)) && args(postId)")
    public Object validateAndUpdate(ProceedingJoinPoint jp, int postId) throws Throwable {

        if(postId < 0){
            LOGGER.info("Post Id is negative");
            postId = -postId;
            LOGGER.info("new value " + postId);
        }

        return jp.proceed(new Object[]{postId});
    }

}
