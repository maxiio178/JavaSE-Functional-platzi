package com.platzi.functional._09_defaults;

public class LernigDefault {

    public static void main(String[] args) {
        StringOperator six = ()-> 6;
        six.operate("Hola desde un metoho defauld");

        System.out.println("<----------------------->");

        DoOperation operationFive = text -> System.out.println(text);
        operationFive.execute(5, "Rokon");
    }

    @FunctionalInterface
    interface StringOperator{
        int getInt();

        default void operate(String text){
            int x = getInt();
            while (x-- > 0){
                System.out.println(text);
            }
        }
    }

    @FunctionalInterface
    interface DoOperation{
        void take(String text);

        default void execute(int x, String text){
            while (x-- > 0) {
                take(text);
            }
        }
    }
}
