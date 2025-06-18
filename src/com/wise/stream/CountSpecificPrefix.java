package com.wise.stream;

import java.util.Arrays;
import java.util.List;

public class CountSpecificPrefix {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Lotus", "Lily", "Sunflower", "Rose", "Jasmin",
                "Lotus", "Tulip", "Rose");
		
		long count = names.stream().filter(n -> n.startsWith("L")).count();
		
		System.out.print(count);

	}

}
