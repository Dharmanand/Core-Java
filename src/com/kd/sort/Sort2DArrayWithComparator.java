package com.kd.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2DArrayWithComparator {

	public static void main(String[] args) {
		int nums [] = {5,2,7,8,4,11,15,10};
 		int n = nums.length;
 		
 		int [][] a = new int [n][2];
 		for(int i=0; i<n; i++){
 			a[i][0] = nums[i];
 			a[i][1] = i;
 		}

 		Arrays.sort(a, new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[0], o2[0]);
			}
 		});
 		
 		for(int i=0; i<n; i++){
 			System.out.println("value: "+a[i][0]);
 			System.out.println("Original Index: "+a[i][1]);
 		}
	}
}
