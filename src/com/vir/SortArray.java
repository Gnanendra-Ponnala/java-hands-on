package com.vir;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 23, 13, 17, 33, 9};
        sortTheArray(numbers);
        for (int num: numbers) {
            System.out.println(num);
        }
    }

    private static void sortTheArray(int[] numbers) {
        for(int i=0; i < numbers.length-1; i++) {
            for(int j=0; j < numbers.length-1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int a = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = a;
                }
            }
        }
    }
}
