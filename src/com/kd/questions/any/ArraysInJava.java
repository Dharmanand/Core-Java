package com.kd.questions.any;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysInJava {

	public static void main(String[] args) {
		assignPrimitiveArrayToObject();
		assignStringArrayToObject();
		assignCollectionToObject();
		assignArraysToObject();
	}

	public static void assignPrimitiveArrayToObject() {
		int[] a = new int[3];
		 
        a[1] = 50;
 
        Object o = a;
 
        int[] b = (int[])o;
 
        b[1] = 100;
 
        System.out.println(a[1]);
 
        ((int[])o)[1] = 500;
 
        System.out.println(a[1]);
	}
	
	public static void assignStringArrayToObject() {
		String[] a = new String[3];
		
		a[1] = "aaa";
		
		Object o = a;
		
		String[] b = (String[])o;
		
		b[1] = "bbb";
		
		System.out.println(a[1]);
		
		((String[])o)[1] = "ccc";
		
		System.out.println(a[1]);
	}
	public static void assignCollectionToObject() {
		ArrayList<String> a = new ArrayList();
		
		a.add("aaa0");
		a.add("bbb0");
		
		Object o = a;
		
		ArrayList<String> b = (ArrayList<String>)o;
		
		b.set(0, "aaa1");
		
		System.out.println(a.get(0));
		
		((ArrayList<String>)o).set(1, "bbb1");
		
		System.out.println(a.get(1));
	}
	public static void assignArraysToObject() {
		ArrayList<String> a = new ArrayList();
		
		a.add("xxx");
		a.add("yyy");
		
		Object o = a.toArray();
		
		String[] b = (String[])o;
		
		b[0] = "xxx1";
		
		System.out.println(a.toArray()[0]);
		
		b[1] = "yyy1";
		
		System.out.println(a.get(1));
	}
	
}
