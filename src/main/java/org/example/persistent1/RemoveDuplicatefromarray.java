package org.example.persistent1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatefromarray {

    static  void mth1(){

        String str="sivakumar";

        //remove duplicate

      //  str.chars().mapToObj(c->(char)c).distinct().forEach(System.out::println);

        Set<String> s=new HashSet<>();
        Set<String> c=new HashSet<>();
      //  List<String> ans=Arrays.stream(str.split("")).filter(c->!s.add(c)).collect(Collectors.toList());
      //  str.chars().filter(ch->!s.add((char)ch)).mapToObj(c->(char)c).forEach(System.out::println);
        str.chars().filter(x->!c.add(String.valueOf((char)x))).mapToObj(ch->(char)ch).forEach(System.out::println);
        //System.out.println(ans);


    }

    public static void main(String[] args) {

        mth1();
    }
}
