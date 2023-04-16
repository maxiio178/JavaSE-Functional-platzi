package com.platzi.functional._05_sam;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static java.time.Period.*;

public class AgeUtil {
    public static void main(String[] args) {
        Function<Integer, String> addCero = x -> x < 10 ? "0" + x : String.valueOf(x);
        TriFunction<Integer, Integer, Integer, LocalDate> parserDate =
                (day, month, year) -> LocalDate.parse(addCero.apply(year) + "-" + addCero.apply(month) + "-" + day);
        TriFunction<Integer, Integer, Integer, Integer> calculateAge =
                (day, month, year) -> Period.between(parserDate.apply(day, month, year),
                        LocalDate.now()).getYears();
        System.out.println(calculateAge.apply(10, 9, 1999));
    }
    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }
}
