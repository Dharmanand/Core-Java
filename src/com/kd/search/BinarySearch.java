package com.kd.search;

import java.util.Arrays;
//https://www.baeldung.com/java-binary-search
public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 24, 25, 12, 85, 10, 91, 112, 77 };
		Arrays.sort(arr);
		int input = 12;
		System.out.println(binarySearch(112, arr));
	}

	private static int binarySearch(int input, int arr[]) {
		
		int index = Integer.MAX_VALUE;
	    int low = 0;
	    int high = arr.length-1;
	    while (low <= high) {
	        int mid = low  + ((high - low) / 2);
	        if (arr[mid] < input) {
	            low = mid + 1;
	        } else if (arr[mid] > input) {
	            high = mid - 1;
	        } else if (arr[mid] == input) {
	            index = mid;
	            break;
	        }
	    }
	    return index;
		
	}

}
