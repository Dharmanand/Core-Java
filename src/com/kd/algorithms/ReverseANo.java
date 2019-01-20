package com.kd.algorithms;

public class ReverseANo {

//	https://www.youtube.com/watch?v=EQ1nLxyNHOk&list=PL5vavXk_T0jIvMrDalLEVuia3zp_vIDJd
	
	public static void main(String[] args) {

		int no = 154569;
		System.out.println("Reverse of No: "+ no +" is "+reverse(no));
		
	}

	public static int reverse(int number) {
		int reverse = 0;
		
		while(number != 0) {
			reverse = reverse*10;
			reverse = reverse + number%10;
			number = number/10;
		}
		
		return reverse;
	}
	
}
