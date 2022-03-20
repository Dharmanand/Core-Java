package com.kd.recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		
		toi(3, 1, 2, 3);
	}
	public static void toi(int n, int t1, int t2, int t3) {
		if(n<=0)
			return;
		toi(n-1, t1, t3, t2);
		System.out.println(n+" moved from "+t1+" to "+t2);
		toi(n-1, t3, t2, t1);
	}
//  Output : 	
//	  1 moved from 1 to 2
//	  2 moved from 1 to 3
//	  1 moved from 2 to 3
//	  3 moved from 1 to 2
//	  1 moved from 3 to 1
//	  2 moved from 3 to 2
//	  1 moved from 1 to 2
}

