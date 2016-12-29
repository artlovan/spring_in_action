package org.springinaction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springinaction.employees.ConfigEmployee;


@Configuration
//@EnableAspectJAutoProxy -> not needed in Spring Boot but required in Spring
public class Config {

    @Bean
    public Performance initPerformance() {
        return new PerformanceImpl();
    }

    @Bean
    public AspectAudience initAudience() {
        return new AspectAudience();
    }

    @Bean
    public AspectPerformanceCounter initPerformanceCounter() {
        return new AspectPerformanceCounter();
    }

    @Bean
    public AspectEncoreableIntroducer initAspectEncoreableIntroducer() {
        return new AspectEncoreableIntroducer();
    }
}
