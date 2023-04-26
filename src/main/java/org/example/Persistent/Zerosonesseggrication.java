package org.example.Persistent;

import java.util.Arrays;

public class Zerosonesseggrication {

    static void mth1(){

        int i[]={ 2 ,0 ,2 ,1 ,1 ,2 ,0 ,0 ,2 ,1 ,0 ,1 ,0 ,0 ,2 ,1};

        int ans[]=Arrays.stream(i).boxed().sorted().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(ans));


    }

    static void mth2(){



    }
    public static void main(String[] args) {

        mth1();
    }
}
