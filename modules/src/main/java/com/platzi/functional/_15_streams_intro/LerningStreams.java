package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LerningStreams {
    public static void main(String[] args) {
        List<String> coursesList = NombresUtils.getList(
                "Java",
                "Bases de datos",
                "HTML",
                "JavaScrips"
        );
        for (String course : coursesList) {
            String newCourse = course.toLowerCase().replace("!", "!!");
            System.out.println("Platzi: " + newCourse);
        }
        Stream<String> coursesStream = Stream.of("Java",
                "Bases de datos",
                "HTML",
                "JavaScrips");
        //  Stream<Integer> curseLengthStream = coursesStream.map(course -> course.length());
       // Optional<Integer> longest = curseLengthStream.max((x, y)-> y-x);


        Stream<String> emphasisCourse = coursesStream.map(course -> course + "!");
        Stream<String> justJavaCourse = emphasisCourse.filter(course -> course.contains("Java"));
        justJavaCourse.forEach(System.out::println);


        // Apartir de java 8 podemos tomar colecciones y convertir a strems de manera muy sencilla
        Stream<String> courseStream2 = coursesList.stream();

        addOperator(courseStream2
                .map(course -> course + "!!")
                .filter(course -> course.contains("Java"))
        ).forEach(System.out::println);
    }
    static <T> Stream<T> addOperator(Stream<T> stream){
        return stream.peek(dato -> System.out.println("DATO: " + dato));
    }
}
