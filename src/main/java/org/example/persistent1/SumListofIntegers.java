package org.example.persistent1;

import java.util.stream.IntStream;

public class  SumListofIntegers {

    static void mth1(){

        int ans=IntStream.range(0,11).sum();
        System.out.println(ans);

    }
    public static void main(String[] args) {

        mth1();
    }
}
