package org.example.demo;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Integer[] array1 = {1, 8,2, 3, 4, 5};
        Integer[] array2 = {4, 5, 6, 7, 8};

        Arrays.stream(array1).filter(Arrays.asList(array2)::contains).forEach(System.out::println);
    }
}
