package com.kd.collection.map.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IterateOverAMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		for (Entry entry : map.entrySet()) {
			// get key
			String key = (String) entry.getKey();
			// get value
			Integer value = (Integer) entry.getValue();
		}
	}
}
