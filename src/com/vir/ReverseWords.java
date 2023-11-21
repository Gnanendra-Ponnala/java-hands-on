package com.vir;

import java.util.StringTokenizer;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class ReverseWords {
    public static void main(String[] args) {
        String message = "Try to complete all exercises within given time";
        String[] arrayOfStrings = message.split(" ");

        String reverseWords = stream(arrayOfStrings).map(StringBuilder::new)
                .map(StringBuilder::reverse).collect(joining(" "));

        System.out.println(reverseWords);

//        StringTokenizer stringTokenizer = new StringTokenizer(message, " ");
//        System.out.println(stringTokenizer.toString());
//        while (stringTokenizer.hasMoreElements()) {
//            String eachToken = stringTokenizer.nextToken();
//
//        }
    }
}
