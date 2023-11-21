package com.vir;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] numbers = {10, 34, 78, 21, 55, 63, 23, 34, 21, 23};

        List<Integer> distinct = Arrays.stream(numbers)
                .boxed().distinct().collect(Collectors.toList());

        System.out.println(distinct);

        //2nd approach

        Set<Integer> distinctSet = Arrays.stream(numbers)
                .boxed().collect(Collectors.toSet());
        System.out.println(distinctSet);

    }
    private static void usingExtraSpace() {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6};
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length - 1];  // add the last element

        // modify original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        // print the result
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
