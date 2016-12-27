package org.springinaction.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springinaction.models.Bird;
import org.springinaction.services.BirdService;

import java.util.Collection;


@RestController
@RequestMapping(value = "/api/animals")
public class BirdController {

    @Autowired
    @Qualifier("birdsFixture")
    private BirdService birdService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getBirdByName(@PathVariable("name") String name) {
        Bird bird = birdService.findByName(name);

        return bird == null ? new ResponseEntity<>(HttpStatus.NOT_FOUND): new ResponseEntity<>(bird, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<?>> getBirds() {
        return new ResponseEntity<>(birdService.findAll(), HttpStatus.OK);
    }
}
