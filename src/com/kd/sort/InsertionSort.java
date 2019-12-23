/**
 * 
 * https://www.youtube.com/watch?v=lCDZ0IprFw4
 * 
 * 1. A sublist(or Sorted Array) is maintained which is always sorted.
 * 2. Not suitable for large data sets.
 * 3. Average and worst case complexity = O(n2).
 * 4. (n-1) pass are required to sort (n) elements.
 * 5. In each pass, we insert current element at appropriate place so that the elements in current range are in order.
 *	[Each pass has 'k' comparision where 'k' is the pass no.]
 */

package com.kd.sort;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 12, 5, 56, 47, 98, -5, -59, 0, -1, -14, 85 };

		int[] sortedArr = sort(arr);
		for (int i = 0; i < sortedArr.length; i++)
			System.out.println(sortedArr[i]);
	}

	private static int[] sort(int[] arr) {
		int size = arr.length;
		int j = 0;
		while (j < size) {
			int temp;
			for (int i = j; i > 0; i--) {
				if (arr[i] < arr[i - 1]) {
					temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
				}
			}
			j++;
		}

		return arr;
	}

}
