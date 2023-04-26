package org.example.persistent1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayConcat {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};

        Object ans[]=Stream.of(arr1,arr2,arr3).flatMap(Stream::of).toArray();
        for (Object o:ans){
            System.out.println(Arrays.toString((long[]) o));
        }

    }
}
