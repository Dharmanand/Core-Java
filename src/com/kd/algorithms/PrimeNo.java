package com.kd.algorithms;

//	https://www.youtube.com/watch?v=Kt5eij6_Rsw&list=PL5vavXk_T0jIvMrDalLEVuia3zp_vIDJd&index=3

public class PrimeNo {

	public static void main(String[] args) {
		int no = 0;
		System.out.println(no +" is Prime: "+isPrime(no));
	}

	public static boolean isPrime(int number) {
		if(number < 1) {
			System.err.println("Please enter a no that should be greater than 1.");
			return false;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
