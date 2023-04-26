package org.example.Persistent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Addinteger {

    static void mth1(){

        IntStream.range(0,10).boxed().map(n->n+10).collect(Collectors.toCollection(ArrayList::new));

        List<Integer> in=IntStream.range(0,10).boxed().map(n->n+10).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(in);

        IntStream.range(1,10).boxed().map(n->n*2).forEach(System.out::println);


    }
    public static void main(String[] args) {
mth1();
    }
}
