package com.wise.stream;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> listOfFlowers = Arrays.asList("Lotus", "Lily", "Sunflower", "Rose", "Jasmin",
                "Lotus", "Tulip", "Rose");

        List<String> uniqueFlowerNames = listOfFlowers.stream().distinct().toList();

        System.out.println("Unique Flowers --" + uniqueFlowerNames);
    }

}
