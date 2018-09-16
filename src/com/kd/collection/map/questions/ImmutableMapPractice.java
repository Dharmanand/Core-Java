package com.kd.collection.map.questions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapPractice {

	private static final Map<Integer, String> map;
	  static {
	    map = new HashMap<>();
	    map.put(1, "one");
	    map.put(2, "two");
	  }
	  
	public static void main(String[] args) {
		Map<Integer, String> immutablemap = null;
		System.out.println(map);
		map.put(1, "one-modified");
		System.out.println(map);
		immutablemap = Collections.unmodifiableMap(map);
		immutablemap.put(1, "one-immutablemap");//Exception in thread "main" java.lang.UnsupportedOperationException
		immutablemap.put(3, "three");//Exception in thread "main" java.lang.UnsupportedOperationException
		System.out.println(immutablemap);

	}

}
