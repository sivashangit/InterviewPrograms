package org.example.Persistent;

import java.util.Arrays;
import java.util.List;

public class Letterstartwith {

    static void mth1(){

        List<String> names = Arrays.asList("siva","shan","muruga","MU");

        names.stream().filter(n->n.toLowerCase().startsWith("m")).forEach(System.out::println);


    }

    public static void main(String[] args) {

        mth1();
    }
}
