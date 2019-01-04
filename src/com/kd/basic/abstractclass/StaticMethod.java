package com.kd.basic.abstractclass;

public class StaticMethod {

	public static void main(String[] args) {
		
		System.out.println(G.test()); //Out Put: G
//		System.out.println(G.test1());//CTE
		
	}

}

abstract class G {
	
	static String test() {
		return "G";
	}
	
	static void test1() {
		System.out.println("G");
	}
	
}
