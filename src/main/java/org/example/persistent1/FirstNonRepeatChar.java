package org.example.persistent1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatChar {

    static void findChar(){

        String str="Java Blog Alive";
        String ch=Arrays.stream(str.replaceAll(" ","").split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(c->c.getValue()==1).findFirst().get().getKey();
        System.out.println(ch);

    }
    public static void main(String[] args) {

        findChar();
    }
}
