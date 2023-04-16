package com.platzi.functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFuncion {
    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text + "!";
        System.out.println(quote.apply("Hola desde el main de StringFuncion"));

        System.out.println(addMark.apply("Hola"));

        BinaryOperator<Integer> multiplicacion =
                (x, y) -> x*y;

        multiplicacion.apply(4,8);

        BiFunction<String, Integer, String> leftPad =
                (text, number) -> String.format("%" + number  + "%");

        System.out.println(leftPad.apply("Java", 10));

    }
}
