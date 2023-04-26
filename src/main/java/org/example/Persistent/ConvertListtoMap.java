package org.example.Persistent;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListtoMap {

    static void mth1(){

        List<Integer>lis= Arrays.asList(1,1,2,2,2,3,3,4,4,4,5,5,5);
        Map<Integer,Long> re=lis.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(re);

    }

    public static void main(String[] args) {

        mth1();
    }

}
