package com.wise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        List<String> listOfStrings =Arrays.asList("Lotus", "Lily", "Sunflower", "Rose", "Jasmin",
                "Lotus", "Tulip", "Rose");


       Map<String,Long> wordCount = listOfStrings.stream().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       System.out.println(wordCount);
    }
}
