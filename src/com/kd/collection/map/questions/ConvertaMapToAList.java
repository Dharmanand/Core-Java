package com.kd.collection.map.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertaMapToAList {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		// key list
		List keyList = new ArrayList(map.keySet());
		// value list
		List valueList = new ArrayList(map.values());
		// key-value list
		List entryList = new ArrayList(map.entrySet());

	}

}
