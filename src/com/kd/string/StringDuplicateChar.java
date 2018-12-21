package com.kd.string;

public class StringDuplicateChar {

	public static void main(String[] args) {
		getStringDuplicateChar("Dharmanand");
	}

	public static void getStringDuplicateChar(String str) {

		char[] chars = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (i != str.indexOf(chars[i])) {
				System.out.println(chars[i]);
			}
		}
	}
}
