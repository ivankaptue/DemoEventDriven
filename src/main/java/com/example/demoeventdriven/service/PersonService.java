package com.example.demoeventdriven.service;

import com.example.demoeventdriven.event.PersonPostUpdateEvent;
import com.example.demoeventdriven.event.PersonPreUpdateEvent;
import com.example.demoeventdriven.model.Person;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * @author Ivan Kaptue
 */
@Log4j2
@RequiredArgsConstructor
@Service
public class PersonService {

    private final ApplicationEventPublisher publisher;

    public void update(Person person) {
        var preUpdateEvent = new PersonPreUpdateEvent(person);
        publisher.publishEvent(preUpdateEvent);

        log.info(preUpdateEvent);
        log.info(person);

        person.setUsername("doe");
        person.setName("John Doe");

        publisher.publishEvent(new PersonPostUpdateEvent(person));
    }

}
