package org.example.persistent1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatNumber {

    static void mth1(){

        int num[]={12,34,56,23,12,34};

       Map<Integer,Long> ans= Arrays.stream(num).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        //System.out.println(ans);
        int i=ans.entrySet().stream().filter(n->n.getValue()==1).findFirst().get().getKey();

      //  System.out.println(i1);
       /* ans.forEach((k,v)->{

            if(v==1){
                System.out.println(k);
            }

        });*/


    }

    public static void main(String[] args) {

        mth1();
    }
}
