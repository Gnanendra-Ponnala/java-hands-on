package com.vir;

import java.util.Arrays;
import java.util.OptionalDouble;

public class GreaterThanAverage {
    public static void main(String[] args) {
        int[] numbers = {10, 12, 15, 18, 20, 22};
        double avg = Arrays.stream(numbers).average().orElseGet( () -> 10);
        Arrays.stream(numbers).filter(num -> num > avg).forEach(System.out::println);
    }
}
