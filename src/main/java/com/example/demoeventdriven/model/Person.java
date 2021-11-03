package com.example.demoeventdriven.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ivan Kaptue
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String username;
    private String name;
    private boolean enabled;
    private String profileUrl;
}
