package org.example.funtionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    //it has one method get it does not take arguments and it will return always string datatype

   // public String get();

    public static void main(String[] args) {

        Supplier<String> s=()-> "100";

        System.out.println(s.get());

        List<String> lis= Arrays.asList();
       // Supplier<String> welcome;
        String st="Hi";
        System.out.println(lis.stream().findAny().orElseGet(s));


    }


}
