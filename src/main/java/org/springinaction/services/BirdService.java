package org.springinaction.services;

import org.springframework.stereotype.Service;
import org.springinaction.models.Bird;

import java.util.Collection;
import java.util.Map;


@Service
public class BirdService {
    private Map<Integer, Bird> birdMap;

    public BirdService() {
    }

    public BirdService(Map<Integer, Bird> birdMap) {
        this.birdMap = birdMap;
    }

    public String makeNoice() {
        return Bird.makeNoise();
    }

    public Bird findById(int id) {
        return birdMap.get(id);
    }

    public Bird findByName(String name) {
        return birdMap.values().stream()
                .filter(b -> b.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public Collection<Bird> findAll() {
        return birdMap.values();
    }
}
