package org.example.persistent1;

import java.util.*;

public class CharcheckinName {

    static void mth1() {
        String str = "sivakumar";

        List<Character> c1 = new ArrayList<>();
        List<Character> c2 = new ArrayList<>();
        for (char ch = 'a'; ch < 'z'; ch++) {

            c1.add(ch);
        }
        System.out.println(c1);
        for (int i = 0; i < str.length(); i++) {

            Character c = str.charAt(i);
            c2.add(c);

        }
        System.out.println(c2);

       for(int i=0;i<c2.size();i++){

           Character ch=c2.get(i);

           if(c1.contains(ch)){
               c1.remove(ch);
           }
       }
        System.out.println(c1);
    }
        public static void main(String[]args){

            mth1();
        }
    }