package com.vir;

import static java.util.Arrays.stream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;

public class CountEachWord {
    public static void main(String[] args) {
        String paragraph = "In the below given Java program will help you to understand how to reverse a String entered by the user. Here, I have used the CharAt() method in order to extract the characters from the input String. The main task of the CharAt() method is to return the character at the specified index in the given String. Then, I have appended them in reverse order to reverse the given String. It is one of the simple approaches to reverse a String in Java.";
        String[] arrayOfWords = paragraph.split(" ");

        modernApproach(arrayOfWords);

        System.out.println();

        traditionalApproach(arrayOfWords);
    }

    private static void modernApproach(String[] arrayOfWords) {
        Map<String, Long> map = stream(arrayOfWords).collect(groupingBy(Function.identity(), LinkedHashMap::new, counting()));
        map.forEach((key, val) -> System.out.println(key + "  --  " + val));
    }

    private static void traditionalApproach(String[] arrayOfWords) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String word: arrayOfWords) {
            if(map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        map.forEach((key, val) -> System.out.println(key + "  --  " + val));
    }
}
