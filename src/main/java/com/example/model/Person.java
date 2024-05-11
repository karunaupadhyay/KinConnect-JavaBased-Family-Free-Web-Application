package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String gender;
    private List<Person> children;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void addChild(Person child) {
        children.add(child);
    }
}


