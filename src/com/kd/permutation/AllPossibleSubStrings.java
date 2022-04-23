package com.kd.permutation;

import java.util.HashSet;
import java.util.Set;

public class AllPossibleSubStrings {

	public static void main(String[] args) {

		String str = "abc";
		Set<String> allSubStrs = new HashSet<>();
		allSubStringsPermute(allSubStrs, str, "");
		System.out.println(allSubStrs);	// output : [a, ab, acb, bc, bca, ac, b, abc, c, cba, bac, cab, ca, ba, cb]
	}

	static void allSubStringsPermute(Set<String> allSubStrs, String str, String st) {

		if (str.length() == 0) {
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			String leftStr = str.substring(0, i);
			String rightStr = str.substring(i + 1);
			allSubStrs.add(st + ch);
	//		System.out.print(st + ch + ", ");
			allSubStringsPermute(allSubStrs, leftStr + rightStr, st + ch);
		}

	}

}
