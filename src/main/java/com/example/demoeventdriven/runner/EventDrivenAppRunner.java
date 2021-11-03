package com.example.demoeventdriven.runner;

import com.example.demoeventdriven.model.Person;
import com.example.demoeventdriven.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author Ivan Kaptue
 */
@RequiredArgsConstructor
@Component
public class EventDrivenAppRunner implements ApplicationRunner {

    private final PersonService personService;

    @Override
    public void run(ApplicationArguments args) {
//        var person = new Person();
//        person.setUsername("admin");
//        person.setName("Jean");
//        personService.update(person);
    }
}
