package org.example.interview;

import java.util.ArrayList;
import java.util.List;

public class AtoZmissingchar {

    static void mth1(){

        List<Character> c1=new ArrayList<>();
        for(char c='a';c<'z';c++){

            c1.add(c);

        }
        System.out.println(c1);
        List<Character> c2=new ArrayList<>();
        String Str="maharashtra";
        for(int i=0;i<Str.length();i++){
            char ch=Str.charAt(i);
            c2.add(ch);

        }
        System.out.println(c2);

        if(c1.contains(c2)){
            c1.remove(c2);

        }
        System.out.println(c1);

    }
    public static void main(String[] args) {

        mth1();
    }
}
