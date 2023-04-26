package org.example.Persistent;

import java.util.Arrays;

public class Camelcasestart {

    static void mth1(){

        String str="ThermoFisherScientific";
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++){

            char c=str.charAt(i);

            if(Character.isUpperCase(c)){

                sb.append(" ");
            }

            sb.append(c);
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {

        mth1();
    }

}
