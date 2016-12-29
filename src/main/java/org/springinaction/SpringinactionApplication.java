package org.springinaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springinaction.employees.Employee;
import org.springinaction.employees.EmployeeImpl;

@SpringBootApplication
//@ComponentScan(basePackages = "org.springinaction")
public class SpringinactionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringinactionApplication.class, args);

        Performance performance = context.getBean(Performance.class);
        performance.perform();

        System.out.println("\n*******************************");
        performance.bestScene(5);
        System.out.println(AspectPerformanceCounter.getCount());

        Encoreable encoreable = context.getBean(Encoreable.class);
        encoreable.performEncore();

        Employee employee = context.getBean(Employee.class);
        employee.findSolution();
    }
}