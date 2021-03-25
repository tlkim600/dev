package com.boilerplate.dev.common.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class logAspect {

	 //BookService의 모든 메서드
    @Before("execution(* com.boilerplate.dev.controller.DevController.*(..))")
    /*@Around("execution(* com.example.demo.controller..*.*(..))")*/
    /*@Around("execution(* com.example.demo..*.*(..))")*/
    public void logging() throws Throwable {
        System.out.println("asdasdasdas das dasa sdas  ");
    }

}
