package com.wise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



public class EachWordFrequency {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java is platform independent",
                "java is Object oriented programming langauge",
                "Java is easy to learn and easy to use");

        //Solution 1
        Map<String, Long> result1 = listOfStrings.stream().
                flatMap(s -> Arrays.stream(s.split("\\s+"))).
                collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        System.out.println(result1);

        //Solution 2
        Map<String,Long> result2 = listOfStrings.stream().
                map(String::toLowerCase).flatMap(s ->Arrays.stream(s.split("\\s+"))).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(result2);
    }
}
