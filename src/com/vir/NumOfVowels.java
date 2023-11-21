package com.vir;

public class NumOfVowels {
    public static void main(String[] args) {
        String message = "Try to complete all exercises within given time";
        char[] arrayOfChar = message.toCharArray();
        int count = 0;
        for (char ch : arrayOfChar) {
            if("aeiouAEIOU".contains("" + ch)){
                count += 1;
            }
        }
        System.out.println("count of vowels " + count);

        long countByJava8 = message.chars().filter( ch -> "aeiouAEIOU".indexOf(ch) != -1).count();
        System.out.println("count of vowels " + countByJava8);
    }
}
