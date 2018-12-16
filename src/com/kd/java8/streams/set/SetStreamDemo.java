package com.kd.java8.streams.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetStreamDemo {

	public static void main(String[] args) {

		Integer [] a = {10,5,58,41,23};
		
		Set<Integer> set = new HashSet<>(Arrays.asList(a));
		
//		Printing elements using for each method
		set.stream().forEach(i -> System.out.println(i));
		System.out.println("-----");
//		Filtering elements using filter and iterating by forEach method
		set.stream().filter(i -> (i%2 != 0)).collect(Collectors.toSet()).forEach(i->System.out.println(i));
		System.out.println("-----");
//		mapping elements using map and iterating by foeEach
		set.stream().map(i -> (i*2)).collect(Collectors.toSet()).forEach(i->System.out.println(i));
		
		
	}
}
