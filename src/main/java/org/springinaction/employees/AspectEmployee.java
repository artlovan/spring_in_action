package org.springinaction.employees;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;

@Aspect
public class AspectEmployee {

    @Pointcut("execution(** org.springinaction.employees.Employee.findSolution(..))")
    public void employeePointcut() {

    }

    @Before("employeePointcut()")
    public void beforeAdvice() {
        System.out.println("*** An issue was identified");
    }

    @After("employeePointcut()")
    public void afterAdvice() {
        System.out.println("*** The issue was fix");
    }

    @Around("employeePointcut()")
    public void aroundAdvice(ProceedingJoinPoint pjp) {
        try {
            System.out.println("===== Around advice registers the call");
            pjp.proceed();
            System.out.println("===== Issues was successfully resolved");
        } catch (Throwable throwable) {
            System.out.println("===== Failed to resolve the issue");
        }
    }

    @Around("employeePointcut()")
    public void aroundAdviceTiming(ProceedingJoinPoint pjp) throws Throwable {
        Instant start = Instant.now();

        System.out.println(">>> " + start);
        pjp.proceed();

        Instant end = Instant.now();

        System.out.println("<<< " + end);
        Duration between = Duration.between(start, end);
    }
}
