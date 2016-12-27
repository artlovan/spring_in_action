package org.springinaction.models;

import org.springframework.stereotype.Repository;

@Repository
public class Bird implements Animal {

    private int id;
    private String name;
    private int age;

    public Bird() {
    }

    public Bird(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static public String makeNoise() {
        return "Apple!\n";
    }
}
