package com.cydeo.task;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeTest {
    public static void main(String[] args) {
        //Print all email
        Stream<Employee> employeeStream = EmployeeData.readAll();

        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("---------------------");

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumber().stream())
                .forEach(System.out::println);


        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumber)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
