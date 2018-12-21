package com.kd.java8.refOperator.methodReference;

/**
 * 
 * @author Kumar
 * 
 *         Method Reference By Double Colon(::) Operator. Here we used
 *         overloaded Methods(static and instance) that referred by functional interface methods
 *         with same argument types.
 *
 */

public class MethodRefereceDemo {

	public static void method1() {
		System.out.println("---method1()---");
	}
	public static void method1(int i) {
		System.out.println("---method1(int i)---: "+i);
	}
	public static void method1(int i, String j) {
		System.out.println("---method1(int i, String j)---: "+i+" and "+j);
	}
	
	public void method2() {
		System.out.println("---method2()---");
	}
	public void method2(int i) {
		System.out.println("---method2(int i)---: "+i);
	}
	public void method2(int i, String j) {
		System.out.println("---method2(int i, String j)---: "+i+" and "+j);
	}

	public static void main(String[] args) {
//		--------Method reference of static methods-------
		System.out.println("--------Method reference of static methods-------");
//		No Arg static method reference
		NoArgMethodInterf mi = MethodRefereceDemo::method1;
		mi.m1();
//		Single Arg static method reference
		SingleArgMethodInterf mi1 = MethodRefereceDemo::method1;
		mi1.m1(10);
//		Multi Arg static method reference
		MultiArgMethodInterf mi2 = MethodRefereceDemo::method1;
		mi2.m1(10, "Kumar");
//		--------Method reference of instance methods-------
		System.out.println("--------Method reference of instance methods-------");
//		No Arg method reference
		NoArgMethodInterf mii = new MethodRefereceDemo()::method2;
		mii.m1();
//		Single Arg method reference
		SingleArgMethodInterf mii1 = new MethodRefereceDemo()::method2;
		mii1.m1(20);
//		Multi Arg method reference
		MultiArgMethodInterf mii2 = new MethodRefereceDemo()::method2;
		mii2.m1(20, "Dharma");
	}

}

interface NoArgMethodInterf {
	void m1();
}

interface SingleArgMethodInterf {
	void m1(int i);
}

interface MultiArgMethodInterf {
	void m1(int i, String j);
}
