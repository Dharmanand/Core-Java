package com.kd.permutation;

public class Permutation {

	public static void main(String[] args) {

		String str = "abc";
		permute(str, "");
//		output : 	abc
//					acb
//					bac
//					bca
//					cab
//					cba
	}

	static void permute(String str, String st) {

		if (str != null && str.length() == 0) {
			System.out.println(st);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			String leftStr = str.substring(0, i);
			String rightStr = str.substring(i + 1);
			
			permute(leftStr + rightStr, st + ch);
		}
	}

}
