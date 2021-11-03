package com.example.demoeventdriven.error;

/**
 * @author Ivan Kaptue
 */
public class PersonUpdateError extends RuntimeException {

    public PersonUpdateError(String message) {
        super(message);
    }

}
