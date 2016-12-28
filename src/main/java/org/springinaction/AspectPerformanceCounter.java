package org.springinaction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectPerformanceCounter {
    private static int count;

    @Pointcut("execution(* org.springinaction.Performance.bestScene(int)) && args(repeatTimes)")
    public void performanceCounterPointcut(int repeatTimes) {

    }

    @Before("performanceCounterPointcut(repeatTimes)")
    public void countRepeatTimes(int repeatTimes) {
        System.out.println("Aspect PerformanceCounter called with parameter: " + repeatTimes);
        count = ++count;
    }

    public static int getCount() {
        return count;
    }
}
