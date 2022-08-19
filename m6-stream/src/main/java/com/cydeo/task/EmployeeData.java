package com.cydeo.task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100, "Mike", "mike@cydeo.com", Arrays.asList("2020202020", "303030303")),
                new Employee(101, "Ozzy", "ozzy@cydeo.com", Arrays.asList("4040404040", "505050505")),
                new Employee(102, "Peter", "peter@cydeo.com", Arrays.asList("101010101", "707070707"))
                );
    }
}
