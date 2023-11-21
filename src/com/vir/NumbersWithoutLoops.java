package com.vir;

import java.util.stream.IntStream;

public class NumbersWithoutLoops {
    public static void main(String[] args) {
        printNumbers(1);
        //IntStream.rangeClosed(1, 10).forEach(System.out::println);
    }

    private static void printNumbers(int number) {
        if(number <=10) {
            System.out.println(number);
            printNumbers(number + 1);
        }
    }
}
