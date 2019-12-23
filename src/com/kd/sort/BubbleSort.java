package com.kd.sort;

public class BubbleSort {

	/**
	 * 
	 * https://www.java2novice.com/java-sorting-algorithms/bubble-sort/
	 * 
	 * Bubble sort has worst-case and average complexity both О(n2), where n is the number of items being sorted. 
	 * There exist many sorting algorithms with substantially better worst-case or average complexity of O(n log n). 
	 * Even other О(n2) sorting algorithms, such as insertion sort, tend to have better performance than bubble sort. 
	 * Therefore, bubble sort is not a practical sorting algorithm when n is large.
	 * Performance of bubble sort over an already-sorted list (best-case) is O(n).
	 */
	
	public static void main(String[] args) {

		int[] arr = { 12, 5, 56, 47, 98, -5, -59 };

		int[] sortedArr = sort(arr);
		for (int i = 0; i < sortedArr.length; i++)
			System.out.println(sortedArr[i]);
	}

	private static int[] sort(int[] arr) {

		int size = arr.length;

		int j = 0;
		while (size - 1 > 0) {
			while (j < size - 1) {
				int temp = 0;
				if (arr[j + 1] < arr[j]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
				j++;
			}

			size--;
			j = 0;
			
		}

		return arr;
	}

}
