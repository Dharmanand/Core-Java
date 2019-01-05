package com.kd.basic.tricky;

public class FinalInstanceVariableFieldWithIIB {

	public static void main(String[] args) {
		A1 a1 = new A1();
		System.out.println(a1.i);
//		a1.i = 101; // CTE - The final field A1.i cannot be assigned
	}

}

class A1 {
	final int i; // without IIB, this line gives CTE - The blank final field i may not have been initialized
	{
		i = 100;
	}
}
