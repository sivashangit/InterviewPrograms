package org.example.Persistent;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonrepeatNumber {

    static void mth1(){

        int num[]={12,34,56,34,12,34,45};

        List<Integer> lis=Arrays.asList(12,34,56);
        Map<Integer,Long> res=Arrays.stream(num).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        int an= res.entrySet().stream().filter(n->n.getValue()==1).findFirst().get().getKey();
        System.out.println("ans is:"+an );

        res.forEach((k,v)->{

            if(v==1){
                System.out.println("firsrt non repeat number:"+k);
            }

        });
        System.out.println(res);


    }

    public static void main(String[] args) {
            mth1();
    }
}
