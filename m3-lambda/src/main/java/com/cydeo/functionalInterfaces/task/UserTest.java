package com.cydeo.functionalInterfaces.task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Mike", "Smith", 35));
        users.add(new User("Tom", "Evan", 25));
        users.add(new User("Emma", "Pellars", 55));

        print(users, user -> true);

        Predicate<User> check = user -> user.getLastName().startsWith("E");
        print(users,check);
    }

    private static void print(List<User> users, Predicate<User> predicate){
        for(User user: users){
            if(predicate.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
