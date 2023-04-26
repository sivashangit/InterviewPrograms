package org.example.persistent1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharTest {

    static void mth1(){
        String str="sivakumar";
        Map<Character,Long> res=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(res);

        Map<String,Long> r=Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(r);

    }

    public static void main(String[] args) {
        mth1();

    }
}
