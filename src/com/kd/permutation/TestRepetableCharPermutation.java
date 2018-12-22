package com.kd.permutation;

import java.util.ArrayList;
import java.util.List;

public class TestRepetableCharPermutation {

	public static void main(String[] args) {
		TestRepetableCharPermutation test = new TestRepetableCharPermutation();
		Object[] arr = test.getPermutationsWithRepetition("ABC");
		
		for(Object st: arr) {
			System.out.println(st);
		}

	}

	public Object[] getPermutationsWithRepetition(String s)
    {
        List<String> permutations = new ArrayList<>();
        this.GetPermutationsWithRepetitionRecursive(s, "",
            permutations);
        return permutations.toArray();
    }
	
    void GetPermutationsWithRepetitionRecursive(String s, String permutation, List<String> permutations)
    {
        if(permutation.length() == s.length())
        {
            permutations.add(permutation);
            return;
        }
        for(int i =0;i<s.length();i++)
        {
            this.GetPermutationsWithRepetitionRecursive(s, permutation + s.charAt(i), permutations);
        }
    }
	
}
