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
//		mapping elements using map and iterating by forEach
		list.stream().map(i -> (i*2)).collect(Collectors.toList()).forEach(i->System.out.println(i));
		System.out.println("---Ascending order--");
//		sorting elements using sorted method and iterating by forEach
		list.stream().sorted().collect(Collectors.toList()).forEach(i->System.out.println(i));
		System.out.println("---Descending order sorting elements--");
//		Descending order sorting elements using sorted method and iterating by forEach
		list.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList()).forEach(i->System.out.println(i));
//		Find min value in list, Note: list should be sorted in natural sorting order(ascending order).
		Integer l1 = list.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println("Min value: "+l1);
//		Find max value in list, Note: list should be sorted in natural sorting order(ascending order).
		Integer l2 = list.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println("Max value: "+l2);
		
	}

}
