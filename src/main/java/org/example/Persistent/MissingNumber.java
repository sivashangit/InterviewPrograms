package org.example.Persistent;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {

    static void mth1(){

        int i[]={12,13,14,16};
        int min= Arrays.stream(i).min().getAsInt();
        int max=Arrays.stream(i).max().getAsInt();

        int sumofarray=Arrays.stream(i).sum();

        int n=IntStream.rangeClosed(min,max).sum()-sumofarray;

        System.out.println(n);

    }

    public static void main(String[] args) {

        mth1();
    }

}
