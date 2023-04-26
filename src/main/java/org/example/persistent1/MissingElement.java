package org.example.persistent1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingElement {

    static void mth1(){

        int num[]={1,2,3,5};

        int sumofarray= Arrays.stream(num).sum();
        int min=Arrays.stream(num).min().getAsInt();
        int max=Arrays.stream(num).max(). getAsInt();
        int missingellement= IntStream.rangeClosed(min,max).sum()-sumofarray;
        System.out.println(missingellement);


    }
    public static void main(String[] args) {

        mth1();
    }
}
