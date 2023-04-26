package org.example.persistent1;

import java.util.Arrays;
import java.util.List;

public class Stringlength {
    static void mth1(){

        List<String> list= Arrays.asList("sivakumar,murugan","java");
        list.stream().filter(n->n.length()>6).forEach(System.out::println);



    }
    public static void main(String[] args) {

        mth1();

    }
}
