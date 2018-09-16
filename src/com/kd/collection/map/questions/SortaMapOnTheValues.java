package com.kd.collection.map.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortaMapOnTheValues {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();

		map.put("ddd", 5);
		map.put("aaa", 2);
		map.put("ccc", 6);
		map.put("bbb", 8);
		map.put("eee", 1);
		
		List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
		 
		  @Override
		  public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
		    return e1.getValue().compareTo(e2.getValue());
		  }
		 
		});
		
		System.out.println(map);
		
	}

}
