package com.kd.permutation;

public class Combination {

	public static void main(String[] args) {
		combination("abc", "");
	}

	private static void combination(String str, String prefix) {
		if (prefix.length() > 0)
			System.out.println(prefix);
		for (int i = 0; i < str.length(); i++)
			combination(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i));
	}

}

//Output : 
//	a
//	ab
//	abc
//	ac
//	acb
//	b
//	ba
//	bac
//	bc
//	bca
//	c
//	ca
//	cab
//	cb
//	cba
