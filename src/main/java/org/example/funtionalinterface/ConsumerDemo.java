package org.example.funtionalinterface;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {


    //it is a funtional interface and has one method accept.
    //it take one argument as type generic and does not return anything
    //we dont need method name,type and data type for write lambada experssion
    //syntax
    /*@FunctionalInterface
    public interface Consumer<T>{

        public void accept(T t);

    }*/

    public static void main(String[] args) {

        Consumer<Integer> c=t-> System.out.println(t+12);

        //c.accept(12);


        List<Integer> lis=Arrays.asList(12,34,12,45);
        lis.stream().forEach(c);

        lis.stream().forEach(n-> System.out.println(n));

    }




}
