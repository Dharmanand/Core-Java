package com.kd.trickeyQA;

import java.util.Arrays;
import java.util.List;

/**
 * NO CTE
 * only: RTE
 * Exception in thread "main" java.lang.UnsupportedOperationException at
 * java.util.AbstractList.add(AbstractList.java:148) at
 * java.util.AbstractList.add(AbstractList.java:108) at
 * com.kd.trickeyQA.ArraysAsList.main(ArraysAsList.java:14)
 * 
 */

public class ArraysAsList {

	public static void main(String[] args) {

		// -------------------with int-----------------
		int[] a = { 1, 2, 8, 6 };
		int[] a2 = { 1, 2, 8, 6 };

		List<int[]> list = Arrays.asList(a);// Look here List<int[]> has int[] Type
		list.add(a2);// (Runtime)Exception in thread "main" java.lang.UnsupportedOperationException
		System.out.println(list);
		// -------------------with Integer-----------------
		Integer b[] = { 1, 5, 9, 8, 6 };
		List<Integer> list1 = Arrays.asList(b);// But here List<Integer> has Integer Type
		list1.add(2);// (Runtime)Exception in thread "main" java.lang.UnsupportedOperationException
		System.out.println(list1);

	}

}
