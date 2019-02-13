package com.kd.trickeyQA;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomSet {

	public static void main(String[] args) {
		System.out.println("----------");
		Random rad = new Random(100);
		for (int i = 0; i < 1000; i++)
			System.out.println(rad.nextInt()); // This will print 1000 different values 
		System.out.println("----------");
		randomIntegerWithSameValue();
		randomIntegerWithDifferentValue();
	}

	private static void randomIntegerWithSameValue() {
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < 100; i++)
			s.add(new Random(100).nextInt());
		System.out.println(s.size()); // output: 1, because here seed is 100 or any then it will return always same
										// result
										// first time
	}

	private static void randomIntegerWithDifferentValue() {
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < 100; i++)
			s.add(new Random().nextInt());
		System.out.println(s.size()); // output: 100, It doesn't have any seed
	}

}
