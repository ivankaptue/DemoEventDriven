package com.example.demoeventdriven.controller;

import com.example.demoeventdriven.model.Person;
import com.example.demoeventdriven.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ivan Kaptue
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class PersonController {

    private final PersonService personService;

    @GetMapping
    public void updatePerson() {
        var person = new Person();
        person.setUsername("admin");
//        person.setUsername("Doe");
        person.setName("Jean");
        personService.update(person);
    }

}
