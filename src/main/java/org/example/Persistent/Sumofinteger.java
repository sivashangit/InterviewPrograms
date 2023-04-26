package org.example.Persistent;

import java.util.Arrays;

public class Sumofinteger {

    static void mth1(){

        int num[]={12,34,56,7};
        int sum=0;

        for(int i=0;i<num.length;i++){

            sum+=num[i];

        }
        System.out.println(sum);

    }

    static void mth2(){

        int num[]={12,34,56,7};

        int i=Arrays.stream(num).sum();
        System.out.println(i);





    }
    public static void main(String[] args) {

        mth1();
    }
}
