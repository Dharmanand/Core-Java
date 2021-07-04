package com.kd.sort;

//https://www.baeldung.com/java-merge-sort

public class Merge {

	public static void main(String[] args) {

		int arr[] = { 24, 25, 12, 85, 10, 91, 112, 77 };
		sortByDivideMerge(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

	private static void sortByDivideMerge(int[] arr) {

		int length = arr.length;
		if (length == 1)
			return;
		int mid = length / 2;
		int left[] = new int[mid];
		int right[] = new int[length - mid];
		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		for (int i = mid; i < length; i++) {
			right[i - mid] = arr[i];
		}
		sortByDivideMerge(left);
		sortByDivideMerge(right);
		sort(arr, left, right);
	}

	private static int[] sort(int[] arr, int[] left, int[] right) {

		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		while (i < left.length) {
			arr[k++] = left[i++];
		}
		while (j < right.length) {
			arr[k++] = right[j++];
		}
		return arr;
	}
}
