package org.example.persistent1;

public class RemoveDigit {

    static void mth1(){

        String str="abcd1234ef";

        String s=str.replaceAll("[a-z]","");
        System.out.println(s);


    }
    public static void main(String[] args) {

        mth1();
    }
}
