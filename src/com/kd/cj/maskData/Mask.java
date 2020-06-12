package com.kd.cj.maskData;

public class Mask {

	private static final String MASK_CHARSEQUENCE = "*****";

	public static String maskData(Object input) {
		if (input == null)
			return null;
		if (input instanceof Character || input instanceof Boolean || input instanceof CharSequence
				|| input instanceof Number) {
//			return masking(input.toString());
			return MASK_CHARSEQUENCE;
		} else
			throw new RuntimeException(input.getClass().getName() + " : does not belongs to correct data type");
	}

	public static String maskData(char input) {
		return MASK_CHARSEQUENCE;
	}

	public static String maskData(short input) {
		return MASK_CHARSEQUENCE;
	}

	public static String maskData(byte input) {
		return MASK_CHARSEQUENCE;
	}

	public static String maskData(int input) {
		return MASK_CHARSEQUENCE;
	}

	public static String maskData(long input) {
		return MASK_CHARSEQUENCE;
	}

	public static String maskData(float input) {
		return MASK_CHARSEQUENCE;
	}

	public static String maskData(double input) {
		return MASK_CHARSEQUENCE;
	}

	public static String maskData(boolean input) {
		return MASK_CHARSEQUENCE;
	}

	/*
	 * private static String masking(String input) {
	 * 
	 * StringBuffer buffer = new StringBuffer(); for (int i = 0; i < input.length();
	 * i++) buffer.append("*"); return buffer.toString();
	 * 
	 * }
	 */

	public static void main(String[] args) {
		System.out.println("----Wrapper types---");
		Person person = null;
		System.out.println(maskData(person));
		person = new Person();
		System.out.println(maskData(person));
		String name = new String();
		System.out.println(maskData(name));
		Character ch = new Character(' ');
		System.out.println(maskData(ch));
		Short s = 158;
		System.out.println(maskData(s));
		Byte b = 10;
		System.out.println(maskData(b));
		Integer i = 158963;
		System.out.println(maskData(i));
		Long l = (long) 158963;
		System.out.println(maskData(l));
		Float f = 158.5f;
		System.out.println(maskData(f));
		Double d = 158.5d;
		System.out.println(maskData(d));
		Boolean flag = true;
		System.out.println(maskData(flag));

		System.out.println("----primitive types---");
		char ch1 = 'a';
		System.out.println(maskData(ch1));
		short s1 = -158;
		System.out.println(maskData(s1));
		byte b1 = 15;
		System.out.println(maskData(b1));
		int i1 = 158963;
		System.out.println(maskData(i1));
		long l1 = (long) 158963;
		System.out.println(maskData(l1));
		float f1 = 158.5f;
		System.out.println(maskData(f1));
		double d1 = -158.5d;
		System.out.println(maskData(d1));
		boolean flag1 = false;
		System.out.println(maskData(flag1));
	}

}
