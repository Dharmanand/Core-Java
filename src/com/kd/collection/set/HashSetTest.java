package com.kd.collection.set;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		
		Enumeration<String> en = Collections.enumeration(set);
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		System.out.println("-------------------");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("-------------------");
		for(String str : set){
			System.out.println(str);
		}
		
	}

}
