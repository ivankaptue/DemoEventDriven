package com.example.demoeventdriven.event;

import com.example.demoeventdriven.model.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author Ivan Kaptue
 */
@ToString
@Getter
@AllArgsConstructor
public class PersonPostUpdateEvent {
    private final Person person;
}
