package com.kd.java8;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		String s= "Dharmanand";
		System.out.println(reverseUsingStreamAPI(s));
		
		Function<String, String> reverse = s1 -> new StringBuilder(s1).reverse().toString();
		System.out.println(reverse.apply(reverseUsingFunction(s)));
		

	}

	public static String reverseUsingStreamAPI(String string) {
        return Stream.of(string)
        		.map(word->new StringBuilder(word).reverse())
            .collect(Collectors.joining());
    }
	
	public static String reverseUsingFunction(String string) {
		Function<String, String> reverse = str -> new StringBuilder(str).reverse().toString();
		return reverse.apply(string);
	}
	
	
}
