package org.springinaction;


import java.util.stream.Stream;

public class PerformanceImpl implements Performance {
    @Override
    public void perform() {
        System.out.println("\tPERFORMING...");
    }

    @Override
    public void bestScene(int repeatTimes) {
        Stream.iterate(1, (i) -> i+1)
                .limit(repeatTimes)
                .forEach((i) -> System.out.println("Special Scene. Repeated " + i + " of " + repeatTimes + " times"));
    }
}
