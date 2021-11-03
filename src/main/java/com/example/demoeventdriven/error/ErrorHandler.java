package com.example.demoeventdriven.error;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Ivan Kaptue
 */
@Log4j2
@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(PersonUpdateError.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<String> personUpdateHandler(PersonUpdateError error) {
        log.info("Error handler");
        log.error(error.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(error.getMessage());
    }

}
