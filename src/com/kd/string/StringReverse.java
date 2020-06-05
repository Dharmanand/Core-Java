package com.kd.string;

public class StringReverse {

	static String temp = "";

	public static void main(String[] args) {

		String str = "Education";

//		System.out.println("Reverse String : " + reverseStringUsingCharArray(str));
//		System.out.println("Reverse String : " + reverseStringUsingRecurtion(str));
		System.out.println("Reverse String : " + reverseStringUsingStringBuilder(str));
	}

	private static String reverseStringUsingCharArray(String str) {
		char[] ch = str.toCharArray();
		String temp = "";
		int size = str.length();
		for (int i = 0; i < size; i++) {
			temp = temp + ch[size - i - 1];
		}
		return temp;
	}

	private static String reverseStringUsingRecurtion(String str) {
		if (str.isEmpty()) {
			System.out.println("String in now Empty");
			return str;
		}
		// Calling Function Recursively
		return reverseStringUsingRecurtion(str.substring(1)) + str.charAt(0);
	}
	
	private static String reverseStringUsingStringBuilder(String str) {
		char[] ch = str.toCharArray();
		StringBuffer temp = new StringBuffer();
		int size = str.length();
		for (int i = 0; i < size; i++) {
			temp.append(ch[size - i - 1]);
		}
		return temp.toString();
	}

}
