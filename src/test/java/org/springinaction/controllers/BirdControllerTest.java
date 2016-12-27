package org.springinaction.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;
import org.springinaction.fixtures.BirdFixtures;
import org.springinaction.models.Bird;

import java.util.Collection;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BirdControllerTest {

    @Autowired
    private Bird bird;
    @Autowired
    private TestRestTemplate testRestTemplate;

    @MockBean
    private BirdController birdController;



    @Before
    public void setUp() {
        Collection<Bird> birds = BirdFixtures.getBirds().values();
        given(birdController.getBirds()).willReturn(new ResponseEntity<>(birds, HttpStatus.OK));
    }

    @Test
    public void birdNotNull() {
        assertNotNull(bird);
    }

    @Test
    public void birdControllerNotNull() {
        assertNotNull(birdController);
//        ResponseEntity<ResponseEntity> forEntity = testRestTemplate.getForEntity("/api/animals", ResponseEntity.class);

    }
}
