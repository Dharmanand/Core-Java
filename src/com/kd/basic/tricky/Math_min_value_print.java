package com.kd.basic.tricky;

public class Math_min_value_print {

	public static void main(String[] args) {
		System.out.println(Double.MIN_VALUE); //output: 4.9E-324
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d)); // output: 0.0
	}
}
