package org.example.Persistent;

import java.util.Optional;

public class OptionalDemo {

    static void mth1(){

        String str = null;
        Optional<String> op=Optional.ofNullable(str);
        System.out.println(op);

        /*Optional<String> op1=Optional.empty();
        if(op1.isPresent()){
            System.out.println(op1);
        }else System.out.println("no value");*/


    }

    public static void main(String[] args) {

        mth1();
    }
}
