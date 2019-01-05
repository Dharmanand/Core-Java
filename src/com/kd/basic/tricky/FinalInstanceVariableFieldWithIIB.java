package com.kd.basic.tricky;

public class FinalInstanceVariableFieldWithIIB {

	public static void main(String[] args) {
		A1 a1 = new A1();
		System.out.println(a1.i);
	}

}

class A1 {
	final int i; // without IIB, this line gives CTE - The blank final field i may not have been initialized
	{
		i = 100;
	}
}
