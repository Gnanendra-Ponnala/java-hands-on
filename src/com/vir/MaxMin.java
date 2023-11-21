package com.vir;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MaxMin {
    public static void main(String[] args) {
        int[] numbers = {43, 23, 39, 29, 77, 68, 21};

        extracted(numbers);

        //other way
        int min = numbers[0], max = numbers[0];
        for (int num : numbers) {

            if(num < min) {
                min = num;
            }

            if(num > max) {
                max = num;
            }
        }
        System.out.println( "Max: " + max + "  Min:  " + min);
    }

    private static void extracted(int[] numbers) {
        int max = Arrays.stream(numbers).max().orElse(0);
        int min = Arrays.stream(numbers).min().orElse(0);
        System.out.println( "Max: " + max + "  Min:  " + min);
    }

    private static void WithCollections(int[] numbers) {
        List<Integer> integerList = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        int max = Collections.max(integerList);
        int min = Collections.min(integerList);
        System.out.println( "Max: " + max + "  Min:  " + min);
    }
}
