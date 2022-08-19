package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        //Creating stream from array
        String[] courses = {"Java","Spring", "Agile"};

        Arrays.stream(courses);

        //Creating stream from Collection
        List<String> courseList = Arrays.asList("Java","Spring", "Agile");
        Stream<String> courseStream2 = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("DS", 101),
                new Course("MS", 102)
        );

        Stream<Course> myCourseStream = myCourses.stream();

        //Creating stream values
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);
    }
}
