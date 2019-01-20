package com.kd.algorithms;

public class SumOfDigitsOfGivenNumber {

	public static void main(String[] args) {
		
		int no = 945699;
		System.out.println("Sum of digits of a No: "+ no +" is "+sumOfDigitsOfANumber(no));
		
	}

	public static int sumOfDigitsOfANumber(int number) {
		int sum = 0;
		while(number != 0) {
			sum = sum + number % 10;
			number = number/10;
		}
		
		return sum;
	}
	
}
