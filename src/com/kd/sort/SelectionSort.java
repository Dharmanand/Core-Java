package com.kd.sort;

/**
 * https://www.tutorialspoint.com/data_structures_algorithms/selection_sort_algorithm.htm
 * 
 * Selection sort is a simple sorting algorithm.
 * This sorting algorithm is an in-place comparison-based algorithm in which the list is divided into two parts, 
 * the sorted part at the left end and the unsorted part at the right end. 
 * Initially, the sorted part is empty and the unsorted part is the entire list.
 * The smallest element is selected from the unsorted array and swapped with the leftmost element, 
 * and that element becomes a part of the sorted array. This process continues moving unsorted array boundary by one element to the right.
 * This algorithm is not suitable for large data sets as its average and worst case complexities are of Ο(n2), where n is the number of items.
 * 
 * 
 *
 */

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 12, 5, 56, 47, 98, -5, -59,0,-1,-6,101 };

		int[] sortedArr = sort(arr);
		for (int i = 0; i < sortedArr.length; i++)
			System.out.println(sortedArr[i]);
	}

	private static int[] sort(int[] arr) {
		int size = arr.length;
		int temp, index=0;
		for(int i=0; i<size; i++) {
			temp=arr[i];
			for(int j=i+1; j<size; j++) {
				if(arr[j]<temp) {
					temp = arr[j];
					index = j;
				}
			}
			if(temp < arr[i]) {
				temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
			
		}
		return arr;
	}
	
}
