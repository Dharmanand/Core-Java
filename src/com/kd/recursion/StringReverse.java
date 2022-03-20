package com.kd.recursion;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println(reverse("abcdefgh")); 
	}

	public static String reverse (String str) {
		if(str.length() == 0)
			return "";
		return str.charAt(str.length()-1)+reverse(str.substring(0, str.length()-1));
	}
	
}
