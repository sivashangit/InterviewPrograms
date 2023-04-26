package org.example.Persistent;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Priticatechain {

    static void mth1(){

        List<String> lis= Arrays.asList("siva","muruga");

        Predicate<String> startwithm=n->n.startsWith("m");
        Predicate<String> endwith=n->n.endsWith("a");

        Predicate<String> re=startwithm.and(endwith);
       List<String> ans= lis.stream().filter(startwithm).collect(Collectors.toList());
        System.out.println(ans);

    }

    public static void main(String[] args) {

        mth1();
    }
}
