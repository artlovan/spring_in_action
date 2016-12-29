package org.springinaction.employees;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigEmployee {

    @Bean
    public Employee employeeBean() {
        return new EmployeeImpl();
    }

    @Bean
    public AspectEmployee aspectBean() {
        return new AspectEmployee();
    }
}
