package com.kd.permutation;

import java.util.ArrayList;
import java.util.List;

public class TestRepetableCharPermutation {

	public static void main(String[] args) {
		TestRepetableCharPermutation test = new TestRepetableCharPermutation();
		Object[] arr = test.getPermutationsWithRepetition("ABC");

		for (Object st : arr) {
			System.out.println(st);
		}

	}

	public Object[] getPermutationsWithRepetition(String s) {
		List<String> permutationsList = new ArrayList<>();
		this.getPermutationsWithRepetitionRecursive(s, "", permutationsList);
		return permutationsList.toArray();
	}

	void getPermutationsWithRepetitionRecursive(String s, String permutation, List<String> permutationsList) {
		if (permutation.length() == s.length()) {
			permutationsList.add(permutation);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			this.getPermutationsWithRepetitionRecursive(s, permutation + s.charAt(i), permutationsList);
		}
	}

}
