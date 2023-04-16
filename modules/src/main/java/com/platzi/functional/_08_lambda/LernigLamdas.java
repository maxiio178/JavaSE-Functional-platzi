package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class LernigLamdas {
    public static void main(String[] args) {

        //Lamdas

        List<String> cursos = NombresUtils.getList("Java", "Python", "JavaScript");

        cursos.forEach(curso -> System.out.println(curso));

        usarZero(() -> 2);

        usarPredicado(text -> text.isEmpty());

        usarBifuncion( (x, y) -> x*y );

        usarBifuncion((x, y)-> {
            System.out.println("X:" + x + ", Y:" + y);
           return x - y;
        });

        usarNada(()-> {
            System.out.println("Hola desde la nada");
        });
    }





    //Methos

    static void usarZero(zeroArguments zeroarguments){

    }

    static void usarPredicado(Predicate<String> predicate){

    }

    static void usarBifuncion(BiFunction<Integer, Integer, Integer> bifunction){

    }
    static void usarNada(nadaOrder nadaorder){

    }










    //Interface
    @FunctionalInterface
    interface zeroArguments {
        int get();
    }

    @FunctionalInterface
    interface nadaOrder {
        void nada();
    }
}
