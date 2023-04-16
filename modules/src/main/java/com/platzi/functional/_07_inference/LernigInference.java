package com.platzi.functional._07_inference;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.Function;

public class LernigInference {
    public static void main(String[] args) {
        Function<Integer, String> functionConvert =
                x -> "Al doble: " + (x * 2);

        List<String> alumnos = NombresUtils.getList("Rokon", "Trosky", "Nicon");
        alumnos.forEach(name -> System.out.println(name));
        alumnos.forEach(System.out::println);
    }
}
