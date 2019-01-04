package com.kd.basic.interf;

public class InterfaceDemo1 implements C{

	int i=3;
	public static void main(String[] args) {
		C c1 = new InterfaceDemo1();
		System.out.println(c1.i);//output: 2
	}

}

interface A {
	int i=0;
}

interface B extends A {
	int i=1;
}

interface C extends B {
	int i=2;
}
