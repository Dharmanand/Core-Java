package com.kd.recursion;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(factorial(6)); //output = 720

	}

	public static int factorial(int n) {
		if(n==1)
			return 1;
		return n*factorial(n-1);
	}
	
}
