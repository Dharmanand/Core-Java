package com.kd.collection;

import java.util.ArrayList;
import java.util.Random;

public class CollectionShuffle {

	public static void main(String[] args) {
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("ide");
		mylist.add("quiz");
		mylist.add("geeksforgeeks");
		mylist.add("quiz");
		mylist.add("practice");
		mylist.add("qa");

		System.out.println("Original List : \n" + mylist);

		Random random = new Random();
		
		for(int i=1; i<=mylist.size(); i++) {
			int j = random.nextInt(i);
			mylist.set(i-1, mylist.set(j, mylist.get(i-1)));
		}
		
		System.out.println("Swapped List : \n" + mylist);
		
//		System.out.println("\nShuffled List with Random() : \n" + mylist);

		// Here we use Random(3) to shuffle given list. Here 3
		// is seed value for Random.
//		Collections.shuffle(mylist, new Random(3));
//		System.out.println("\nShuffled List with Random(3) : \n" + mylist);

		// Here we use Random(5) to shuffle given list. Here 5
		// is seed value for Random.
//		Collections.shuffle(mylist, new Random(5));
//		System.out.println("\nShuffled List with Random(5) : \n" + mylist);

	}

}
