package com.kd.java8.refOperator;

/**
 * 
 * @author Kumar
 * 
 *         Constructor Reference By Double Colon(::) Operator. Here we used
 *         overloaded constructors that referred by functional interface methods
 *         with same argument types.
 *
 */
public class ConstructorReferenceDemo {

	public ConstructorReferenceDemo() {
		System.out.println("From No Arg contructor");
	}

	public ConstructorReferenceDemo(int i) {
		System.out.println("From Arg contructor value passed: " + i);
	}

	public ConstructorReferenceDemo(int i, String l) {
		System.out.println("From Multi Arg contructor 1st and 2nd value passed respectivly: " + i + " and " + l);
	}

	public static void main(String[] args) {
//		No Arg constructor reference
		NoConstructInterf ci = ConstructorReferenceDemo::new;
		ci.m1();
//		Single Arg constructor reference
		ArgConstructInterf ci1 = ConstructorReferenceDemo::new;
		ci1.m1(10);
//		Multi Arg constructor reference
		MultiArgConstructInterf ci2 = ConstructorReferenceDemo::new;
		ci2.m1(5, "Kumar");
	}

}

interface NoConstructInterf {
	void m1();
}

interface ArgConstructInterf {
	void m1(int i);
}

interface MultiArgConstructInterf {
	void m1(int i, String j);
}