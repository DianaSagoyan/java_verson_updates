package com.cydeo.tasks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class Person {
    private String name;
    private int age;
    private Gender gender;
}
