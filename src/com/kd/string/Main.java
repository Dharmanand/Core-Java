package com.kd.string;

public class Main {
	public static void main(String[] args) {

		int mat[][] = { { 10, 20, 30, 40 }, 
					   { 15, 25, 35, 45 }, 
					   { 27, 29, 37, 48 }, 
					   { 32, 33, 39, 50 },
					   { 81, 83, 89, 100 }};
		search(mat, 4, 100);
	}

	private static void search(int[][] mat, int size, int n) {
		int i = 0, j = 0;
		while (i < mat.length && j < size) {

			if (mat[i][j] == n) {
				System.out.println("mat[" + i + "][" + j + "]");
				return;
			}
			j++;
			if (j == 4) {
				i++;
				j = 0;
			}
		}
	}
}
