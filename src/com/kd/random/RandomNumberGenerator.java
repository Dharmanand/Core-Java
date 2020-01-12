package com.kd.random;

import java.util.ArrayList;

public class RandomNumberGenerator {

	public static void main(String[] args) {

		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("ide");
		mylist.add("quiz");
		mylist.add("kd");
		mylist.add("quiz");
		mylist.add("practice");
		mylist.add("qa");

		System.out.println("Original List : \n" + mylist);

		for (int i = 1; i <= mylist.size(); i++) {
			mylist.set(i - 1, mylist.set(new RandomNumberGenerator().generateRandomNo(i), mylist.get(i - 1)));
		}
		System.out.println("Suffle List : \n" + mylist);
		
		System.out.println(new RandomNumberGenerator().generateRandomNo(1));

	}

	/**
	 * This method generate random number between 0 to (no-1);
	 * 
	 */
	
	public int generateRandomNo(int no) {
		int random = (int) (new Object().hashCode() + System.currentTimeMillis() % new Object().hashCode()
				+ System.currentTimeMillis() % new Object().hashCode() + new Object().hashCode()) % no;
		if (random < 0)
			return -random;
		else if (random == 0 && no == 1)
			return 0;
		return random;
	}
	
}
