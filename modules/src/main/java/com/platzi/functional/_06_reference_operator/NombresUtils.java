package com.platzi.functional._06_reference_operator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NombresUtils {
    public static void main(String[] args) {
        List<String> profesores = getList("Mario", "Roko", "Luz", "Comida");
        Consumer<String> parsear = name -> System.out.println(name);
        profesores.forEach(parsear);
        System.out.println("////////////");
        profesores.forEach(System.out::println);
    }
    public static <T> List<T> getList(T... elements){
        return Arrays.asList(elements);
    }
}
