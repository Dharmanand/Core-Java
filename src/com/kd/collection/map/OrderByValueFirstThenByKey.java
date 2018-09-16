package com.kd.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OrderByValueFirstThenByKey {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("aaak", 93);
		map.put("aaaj", 93);
		map.put("aaah", 20);
		map.put("aaag", 45);
		map.put("aaad", 2);
		map.put("aaai", 67);
		map.put("aaaf", 26);
		map.put("aaab", 93);
		map.put("aaac", 2);
		map.put("aaae", 45);
		Set<Entry<String, Integer>> set = map.entrySet();
		System.out.println(set);
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				if (o2.getValue() == o1.getValue()) {
					return (o1.getKey()).compareTo(o2.getKey());
				}
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		System.out.println(list);
		/*
		 * for(Map.Entry<String, Integer> entry:list){
		 * System.out.println(entry.getKey()+" ==== "+entry.getValue()); }
		 */
	}

}
