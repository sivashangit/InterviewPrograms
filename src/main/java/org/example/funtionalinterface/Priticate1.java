package org.example.funtionalinterface;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface test{

    void startwith(char c);
}

public class Priticate1 {

    public static void main(String[] args) {

        Predicate<String> pri=n->n.startsWith("m")&&n.length()>3;

       List<String> str= Arrays.asList("muruga","mhan");
       str.stream().filter(pri).forEach(System.out::println);
    }

}
