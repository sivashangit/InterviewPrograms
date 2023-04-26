package org.example.Persistent;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdHighestValue {

    static void mth(){

        List<Integer> in= Arrays.asList(12,23,45,12,67);
        List<Integer> ans= in.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(ans);
        int i=in.stream().sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst().get();
        System.out.println(i);


    }

    public static void main(String[] args) {

        mth();
    }

}
