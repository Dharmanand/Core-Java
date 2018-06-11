package com.kd.string;

import java.util.HashMap;

public class StringRepeatableCharCount {

	public static void main(String[] args) {
		String str = "hdfkdjdgrwtugdgfdgfdgd";
		HashMap<Character, Integer> countMap = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			Character charAt = str.charAt(i);
			if (countMap.get(charAt) == null)
				countMap.put(charAt, 1);
			else
				countMap.put(charAt, countMap.get(charAt)+1);
		}
		System.out.println(countMap);
	}

}
