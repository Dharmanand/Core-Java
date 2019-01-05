package com.kd.basic.interf;

public interface InterfTest2 {

	int i; //CTE - The blank final field i may not have been initialized
	public abstract void test();
	
}

class Demo1 {
	final int i; //CTE - The blank final field i may not have been initialized
}
