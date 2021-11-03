package com.example.demoeventdriven.event;

import com.example.demoeventdriven.model.Person;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Ivan Kaptue
 */
@ToString
@Getter
public class PersonPreUpdate2Event {
    private final Person person;
    @Setter
    private boolean canUpdate = false;

    public PersonPreUpdate2Event(Person person) {
        this.person = person;
    }
}
