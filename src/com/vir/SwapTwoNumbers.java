package com.vir;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int firstVal = 10, secondVal = 20;
        firstVal +=  secondVal;
        secondVal = firstVal - secondVal;
        firstVal = firstVal - secondVal;

        System.out.println("After swapping,  firstVal = " + firstVal + " and secondVal = " + secondVal);
    }

}
