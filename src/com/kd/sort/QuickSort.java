package com.kd.sort;

public class QuickSort {

	static int[] a = { 5, 4, 15, 54, 25, 32, 7, 10, 9, 45, 16 };

	public static void main(String[] args) {

		quicksort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);

	}

	public static int partition(int[] a, int startIndex, int endIndex) {
		int pivot = a[endIndex];
		int partitionIndex = startIndex;
		for (int i = startIndex; i < endIndex; i++) {
			if (a[i] <= pivot) {
				swap(a, i, partitionIndex);
				partitionIndex++;
			}
		}
		swap(a, partitionIndex,endIndex);
		return partitionIndex;
	}

	public static void quicksort(int[] a, int startIndex, int endIndex) {

		if (startIndex < endIndex) {

			int partitionIndex = partition(a, startIndex, endIndex);
			quicksort(a, startIndex, partitionIndex - 1);
			quicksort(a, partitionIndex + 1, endIndex);
		}
	}

	public static void swap(int[] a, int currentIndex, int partitionIndex) {
		int temp = a[currentIndex];
		a[currentIndex] = a[partitionIndex];
		a[partitionIndex] = temp;
	}
}
