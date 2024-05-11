
package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.model.Person;

@Controller
public class FamilyTreeController {

    private static final String FEMALE = "Female";

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @ModelAttribute("familyData")
    public Person getFamilyData() {
        Person grandpa = new Person("Grandpa", "Male");
        Person grandma = new Person("Grandma", FEMALE);
        Person father = new Person("Father", "Male");
        Person mother = new Person("Mother", FEMALE);
        Person child1 = new Person("Child 1", "Male");
        Person child2 = new Person("Child 2", FEMALE);

        grandpa.addChild(father);
        grandma.addChild(father);
        grandpa.addChild(mother);
        grandma.addChild(mother);
        father.addChild(child1);
        father.addChild(child2);
        mother.addChild(child1);
        mother.addChild(child2);

        return grandpa;
    }
}
