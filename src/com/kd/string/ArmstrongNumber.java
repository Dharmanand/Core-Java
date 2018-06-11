package com.kd.string;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println(isArmstrongNumber(371));

	}

	public static boolean isArmstrongNumber(int num) {

		int sum = 0;
		int val = num;
		int temp;

		while (val > 0) {
			temp = val % 10;
			sum = sum + (temp * temp * temp);
			val = val/10;
		}
		System.out.println("Num: "+num);
		System.out.println("Sum: "+sum);
		if (num == sum)
			return true;
		else
			return false;

	}

}
