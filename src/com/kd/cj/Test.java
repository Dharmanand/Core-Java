package com.kd.cj;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		
		Object strs[] = list.toArray();
		for(Object str : strs){
			System.out.println(str);
		}
		
		Set<String> set = new HashSet<>();
		
//		set.

	}

}
