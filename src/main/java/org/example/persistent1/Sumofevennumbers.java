package org.example.persistent1;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Sumofevennumbers {

    static void mth1(){

        List<Integer> lis= Arrays.asList(12,34,23,45,68);
        int ans=lis.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
        System.out.println(ans);
    }
    public static void main(String[] args) {

        mth1();
    }
}
