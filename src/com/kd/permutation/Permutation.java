package com.kd.permutation;

public class Permutation {

	public static void main(String[] args) {

		permutation("abc", "");
	}

	private static void permutation(String str, String prefix) {

		int length = str.length();

		if (length == 0)
			System.out.println(prefix);
		else
			for (int i = 0; i < length; i++)
				permutation(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i));

	}
/*	Output : 
		abc
		acb
		bac
		bca
		cab
		cba */

}
