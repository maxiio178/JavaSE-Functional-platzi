package com.platzi.functional._10_chaining;

public class LerningChaining {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hola")
                .append("que haces?")
                .append("por que yo")
                .append("estoy aprendiendo")
                .append("todo lo que pueda");
        Chainer chainer = new Chainer();
        chainer.sayBye().sayBye();
    }

    static class Chainer {
        public Chainer sayHi(){
            System.out.println("Hi");
            return this;
        }
        public Chainer sayBye(){
            System.out.println("Bye");
            return this;
        }
    }
}
