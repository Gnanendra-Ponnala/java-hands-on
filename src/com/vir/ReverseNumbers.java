package com.vir;

public class ReverseNumbers {
    public static void main(String[] args) {
        int numbers = 12345;
        int reversed = 0;
        while(numbers != 0) {
            int digit = numbers % 10;
            reversed = reversed * 10 + digit;
            numbers /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
