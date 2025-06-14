package com.wise.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 *   Input : Sky is Blue
 *   Output: eulB si ykS
 */
public class ReverseString {
    public static void main(String[] args) {
        String str = "Sky is Blue";

        String result = Arrays.stream(str.split(" ")).
                 map(word -> new StringBuilder(word).reverse().toString()).
                sorted(Comparator.naturalOrder()).
                collect(Collectors.joining(" "));

        System.out.println(result);

    }
}
