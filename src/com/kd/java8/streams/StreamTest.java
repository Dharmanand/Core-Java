package com.kd.java8.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StreamTest {
	
	public static void main(String[] args) {
		collectionAddAll();
		
	}

	private static void collectionAddAll() {
//		List<Integer> list1 = Arrays.asList(5, 12, 9, 3, 15, 88);
//		System.out.println(list1);
		
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1, 2, 3, 4, 5);
		System.out.println(list);
		
//		List iteration using steam API
		list.stream().forEach(l -> System.out.println(l));
		
		Set<Integer> set = new HashSet<>();
		Collections.addAll(set, 1, 2, 3, 4, 5);
		System.out.println(set);
		
//		Set iteration using steam API
		set.stream().forEach(l -> System.out.println(l));
	}
	
}
