package org.example.persistent1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Groupstringbasedlength {

    static void mth1(){

        List<String> lis= Arrays.asList("abc","pqr","abcd","pqrs","ab","pq");
        Map<Integer,List<String>> ans=lis.stream().collect(Collectors.groupingBy(String::length));
        ans.forEach((k,v)->{

            System.out.println(v);
        });



    }
    public static void main(String[] args) {

        mth1();
    }
}
