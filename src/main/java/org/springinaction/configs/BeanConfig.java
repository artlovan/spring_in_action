package org.springinaction.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springinaction.fixtures.BirdFixtures;
import org.springinaction.services.BirdService;


@Configuration
public class BeanConfig {

    @Bean(name = "birdsFixture")
    public BirdService getBirdsFixture() {
        return new BirdService(BirdFixtures.getBirds());
    }

}
