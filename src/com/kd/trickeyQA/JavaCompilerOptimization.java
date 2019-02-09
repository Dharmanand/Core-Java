package com.kd.trickeyQA;

public class JavaCompilerOptimization {

	public static void main(String[] args) {
		System.out.println(T.x); // output = 100, here T loaded will not print because x is final static,so 100 will be on place of T.x
	}

}

class T {
	
	public static final int x = 100;
	
	static {
		System.out.println("T loaded");
	}
	
}
