package com.kd.customWrappers;

public class IntegerCustom {

	private static int j;

	public static int valueOf(String str) throws RuntimeException {

		boolean isNegative = str.startsWith("-");
		int i = 0;
		if (isNegative)
			i = 1;
		for (;i < str.length(); i++) {
			j = j * 10 + parseCharInt(str.charAt(i));
		}
		if (isNegative)
			j = -j;
		return j;
	}

	public static int parseCharInt(Character ch) {
		String numStr = "0123456789";
		int i = 0;
		if (numStr.contains(ch.toString())) {
			i = Character.getNumericValue(ch);
		} else {
			throw new RuntimeException(ch + ": Can't convert to Integer.");
		}
		return i;
	}

	public static void main(String[] args) {
		String str = "25";
		System.out.println(IntegerCustom.valueOf(str));
	}
}
