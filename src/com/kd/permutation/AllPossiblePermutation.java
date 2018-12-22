package com.kd.permutation;

public class AllPossiblePermutation {

	public static void main(String[] args) {
		permute("ABC");
	}

	public static void permute(String full) {
		if (full == null || full.length() == 0) {
			System.out.println("Please provide the String that length should be > 0");
			return;
		}
		permute("", full);
	}

	private static void permute(String prefix, String remaining) {
		if (remaining.length() == 0) {
			System.out.println(prefix);
			return;
		}

		for (int i = 0; i < remaining.length(); i++) {
			permute(prefix + remaining.charAt(i),
					remaining.substring(0, i) + remaining.substring(i + 1, remaining.length()));
		}

	}

}
