package com.kd.recursion;

import java.util.Scanner;

public class PrimaryNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(prime(n, n / 2));
		s.close();
	}

	public static boolean prime(int n, int i) {

		if (i == 1)
			return true;

		if (n % i == 0)
			return false;
		return prime(n, i - 1);

	}

}
