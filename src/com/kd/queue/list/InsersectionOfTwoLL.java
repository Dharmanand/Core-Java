package com.kd.queue.list;

import java.util.LinkedList;
import java.util.List;

public class InsersectionOfTwoLL {

	public static void main(String[] args) {

		LinkedList<String> list1 = new LinkedList<>();
		list1.add("aaa");
		list1.add("bbb");
		list1.add("ccc");
		list1.add("ddd");
		list1.add("eee");
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("lmn");
		list2.add("pqr");
		list2.add("ccc");
		list2.add("str");
		list2.add("ser");

		findIntersectionUsingNestedLoop(list1, list2);
		findIntersectionUsingSingleLoop(list1, list2);

	}

	public static void findIntersectionUsingNestedLoop(List<String> list1, List<String> list2) {

		for (String s1 : list1) {
			for (String s2 : list2) {
				if (s1 == s2) {
					System.out.println("Intersection point is : " + s1);
					break;
				}
			}
		}
	}

	public static void findIntersectionUsingSingleLoop(List<String> list1, List<String> list2) {

		for (String s2 : list2) {
			if (list1.contains(s2)) {
				System.out.println("Intersection point is : " + s2);
				break;
			}
		}
	}
}
