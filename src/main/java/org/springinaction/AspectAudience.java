package org.springinaction;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectAudience {
    @Pointcut("execution(** org.springinaction.Performance.perform(..))")
    public void performancePointCut() {

    }

    @Before("performancePointCut()")
    public void silenceCellPhones() {
        System.out.println("Silencing Cell Phones");
    }

    @Before("performancePointCut()")
    public void takeSeats() {
        System.out.println("Taking Seats");
    }

    @AfterReturning("performancePointCut()")
    public void Applause() {
        System.out.println("clap clap clap!!");
    }

    @AfterThrowing("performancePointCut()")
    public void demandRefund() {
        System.out.println("demanding refund");
    }

    @Around("performancePointCut()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("AROUND Silencing cell phones");
            System.out.println("AROUND Taking seats");
            jp.proceed();
            System.out.println("AROUND CLAP CLAP CLAP!!!");
        } catch (Throwable e) {
            System.out.println("AROUND Demanding a refund");
        } }
}
