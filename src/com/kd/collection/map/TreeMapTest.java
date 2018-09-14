package com.kd.collection.map;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {

		TreeMap<String, Integer> tmap = new TreeMap<>();
		
//		tmap.put("a", 12);
		tmap.put(null, 102);
		tmap.put("b", 120);
		
		System.out.println(tmap);

	}

}
