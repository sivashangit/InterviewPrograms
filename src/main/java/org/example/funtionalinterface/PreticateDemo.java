package org.example.funtionalinterface;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PreticateDemo {

    //Predicate is funtional interface it has only one method test
    //it will take one argument as type generic like any type and return boolean true are false
    /*syntax

    public boolean Test(T t);
     */

    public static void main(String[] args) {

        Predicate<Integer> p=n->n>10;

        Predicate<String> n=s->s.length()>4;
        System.out.println(p.test(2));


        List<String> names= Arrays.asList("muruga","siva","suganya");
        List<String> ans=names.stream().filter(n).collect(Collectors.toList());
        System.out.println(ans);



    }

}
