package com.nowcoder.community.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AlphaAspect {

    @Pointcut("execution(* com.nowcoder.community.service.*.*(..))")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void before(){

    }

    @After("pointcut()")
    public void after(){

    }

    @AfterReturning("pointcut()")
    public void afterThrowing(){

    }

}
