package org.springinaction.fixtures;

import org.springinaction.models.Bird;

import java.util.HashMap;
import java.util.Map;

public class BirdFixtures {
    public static Map<Integer, Bird> getBirds() {
        return new HashMap<Integer, Bird>() {
            {
                put(1, new Bird(1, "Polly", 15));
                put(2, new Bird(2, "Donni", 4));
                put(3, new Bird(3, "Nohr", 8));
            }
        };
    }
}
