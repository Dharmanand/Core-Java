package com.kd.basic.tricky;

public class FinalStaticVariableFieldWith_IIB_SIB {

	public static void main(String[] args) {
		A2 a2 = new A2();
		System.out.println(a2.i);//output : 100
	}

}

class A2 {
	final static int i; // without SIB, this line gives CTE - The blank final field i may not have been initialized
	static {
		i = 100;
	}
	{
//		i = 101; // This IIB section, we can not re-assign static final variable here. until this line will give CTE. 
	}
}