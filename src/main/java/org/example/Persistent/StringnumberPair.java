package org.example.Persistent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringnumberPair {

    static void mth(){

        List<String> lis= Arrays.asList("abc","pqr","abcd","pqrs","ab","pq");

        Map<Integer,List<String>> re=
                lis.stream().collect(Collectors.groupingBy(String::length));
        List<List<String>> r=new ArrayList<>(re.values());
        System.out.println(r);

    }

    public static void main(String[] args) {

        mth();

    }
}
