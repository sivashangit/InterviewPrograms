package org.example.funtionalinterface;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

@FunctionalInterface
interface MathOperation {

    int sub(int i,int j);
}

public class C1 {

    public static void main(String[] args) {

        MathOperation mth=(a,b)->{
           return (a-b);
        };

        int o=mth.sub(100,30);
        System.out.println(o);


    }
}

