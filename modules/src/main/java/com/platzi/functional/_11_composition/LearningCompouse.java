package com.platzi.functional._11_composition;

import java.util.function.Function;

public class LearningCompouse {
    public static void main(String[] args) {
        Function<Integer, Integer> multiply3 = x -> {
            System.out.println("Multiplicando x: " + x + " por 3");
            return x * 3;
        };

        Function<Integer, Integer> add1to3 =
                multiply3.compose(y -> {
                    System.out.println("Le agregue 1 a: " + y);
                    return y + 1;
                });
        Function<Integer, Integer> andSquare =
                add1to3.andThen(x -> {
                    System.out.println("Estoy elevando " + x + " al cuadrado");
                    return x * x;
                });

        System.out.println(
                andSquare.apply(3)
        );
    }
}
