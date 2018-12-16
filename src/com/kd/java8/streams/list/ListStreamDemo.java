package com.kd.java8.streams.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListStreamDemo {

	public static void main(String[] args) {

		Integer [] a = {10,5,58,41,23};
		
		List<Integer> list = Arrays.asList(a);
		
//		Printing elements using for each method
		list.stream().forEach(i -> System.out.println(i));
		System.out.println("-----");
//		Filtering elements using filter and iterating by forEach method
		list.stream().filter(i -> (i%2 != 0)).collect(Collectors.toList()).forEach(i->System.out.println(i));
		System.out.println("-----");
//		mapping elements using map and iterating by foeEach
		list.stream().map(i -> (i*2)).collect(Collectors.toList()).forEach(i->System.out.println(i));
		
		
	}

}
