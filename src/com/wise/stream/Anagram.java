package com.wise.stream;

import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {

        String anagramStr1 = "Cat";
        String anagramStr2 = "act";

        System.out.println(isAnagram(anagramStr1, anagramStr2));

    }

    private static boolean isAnagram(String anagramStr1, String anagramStr2) {
        String sorted1 = anagramStr1.toLowerCase().chars().sorted().
                mapToObj(s -> String.valueOf((char) s)).collect(Collectors.joining());

        String sorted2 = anagramStr2.toLowerCase().chars().sorted().
                mapToObj(s -> String.valueOf((char) s)).collect(Collectors.joining());

        return sorted1.equals(sorted2);
    }
}
