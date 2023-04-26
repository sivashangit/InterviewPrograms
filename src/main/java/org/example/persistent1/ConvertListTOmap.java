package org.example.persistent1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListTOmap {


    static void mth() {

        List<Integer> lis = Arrays.asList(1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5);
        Map<Integer,Long> ans=lis.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(ans);
        ans.forEach((k,v)->{
            System.out.println("Key ="+k+"value="+v);

        });

    }


    public static void main(String[] args) {

        mth();
    }
}
