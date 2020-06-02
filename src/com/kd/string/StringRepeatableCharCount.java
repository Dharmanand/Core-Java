package com.kd.string;

import java.util.HashMap;
import java.util.Map;

public class StringRepeatableCharCount {

	public static void main(String[] args) {
		String str = "kumarakkm";
		repeatableCharCountWithoutCollections(str);
	}
	
	public static void repeatableCharCount(String str) {
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
	
	public static void repeatableCharCountWithoutCollections(String str) {
		
		char[] chars = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			if(i != str.indexOf(chars[i])) {
				if(map.get(chars[i]) == null) 
					map.put(chars[i], 1);
				else
					map.put(chars[i], map.get(chars[i])+1);
				System.out.println(chars[i]);
			}
			
		}
		System.out.println(map);
	}

}
