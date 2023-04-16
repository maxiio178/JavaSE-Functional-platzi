package com.platzi.functional._14_optionals;

import java.util.*;

public class LearningOpcional {
    public static void main(String[] args) {
        List<String> names = getNames();
        if(names != null){

        }
        Optional<List<String>> optionalStrings = getOptionalName();
        if (optionalStrings.isPresent()){

        }

        optionalStrings.ifPresent(namesValue -> namesValue.forEach(System.out::println));
        Optional<String> valaublePlayer = opcionalValueblePlayer();
        String valuablePlayerName = valaublePlayer.orElseGet(()-> "No player");
    }




    //Methodos
    static List<String> getNames(){
        List<String> list = new LinkedList<>();
        return Collections.emptyList();

    }
    static String mostValuablePlayer(){
        return null;
    }
    static int mostExpensiveItem(){
        return -1;
    }
    static Optional<List<String>> getOptionalName(){
        List<String> nameList = new LinkedList<>();
        return Optional.of(nameList);
    }
    static Optional<String> opcionalValueblePlayer(){
        try {
            //return Optional.ofNullable()
            return Optional.of("Mario");
        }catch (Exception e){
            System.out.println(e);
        }

        return Optional.empty();
    }
}
