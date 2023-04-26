package org.example.interview;

import java.util.Arrays;
import java.util.List;

public class Lengthcheck {
    static void mth1(){

        List<String> list = Arrays.asList("muruga", "sivakum", "teo");
        list.stream().filter(n->n.length()>=6).map(na->na).forEach(System.out::println);

    }

    public static void main(String[] args) {

        mth1();

    }

}
