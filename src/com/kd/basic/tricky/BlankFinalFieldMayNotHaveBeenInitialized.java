package com.kd.basic.tricky;

public class BlankFinalFieldMayNotHaveBeenInitialized {

	static final String name; // CTE - The blank final field name may not have been initialized
	
	public static void main(String[] args) {
		System.out.println(name.length());
	}

}
