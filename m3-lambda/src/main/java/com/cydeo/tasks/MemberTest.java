package com.cydeo.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {

        Person p1 = new Person("Mike", 35, Gender.MALE);
        Person p2 = new Person("Ozzy", 25, Gender.MALE);
        Person p3 = new Person("Tom", 15, Gender.MALE);
        Person p4 = new Person("Emma", 45, Gender.FEMALE);

        List<Person> personList = Arrays.asList(p1, p2, p3, p4);

        CheckMember checking = member -> member.getGender().equals(Gender.MALE) && member.getAge() >= 18 && member.getAge() <= 25;
        print(personList, checking);
    }

    private static void print(List<Person> personList, CheckMember checkMember){
        List<Person> result = new ArrayList<>();
        for(Person person: personList){
            if(checkMember.check(person)){
                result.add(person);
            }
        }
        System.out.println(result);
    }
}
