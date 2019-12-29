package com.kd.threads.fieldVisibilityProblem;

/**
 * https://www.youtube.com/watch?v=WH5UvQJizH0&list=PLhfHPmPYPPRk6yMrcbfafFGSbE2EPK_A6&index=3
 * 
 * Here, t2 updates flag to true, but updated value is not visible in t1 because it is already
 * running and reading the value from core local cache memory. So t1 while loop operation will never end.
 * 
 * To resolve this problem flag should be declare with volatile keyword. So flag value will updated by both threads on shared cache.
 *
 */

public class FieldVisibilityProblem {

//	volatile boolean flag = true;
	boolean flag = true;
	
	public static void main(String[] args) throws InterruptedException {
		
		new FieldVisibilityProblem().checkFieldVisibility();

		System.out.println("Main method is over.");

	}

	public void checkFieldVisibility() throws InterruptedException {
		Thread t1 = new Thread(()-> {
			
			while(flag) {
				//do some stuffs
			}
			System.out.println("while loop is over");
		});
		Thread t2 = new Thread(()-> {
			flag = false;
		});
		
		t1.start();
		Thread.sleep(100);
		System.out.println(flag);
		Thread.sleep(100);
		t2.start();
		Thread.sleep(100);
		System.out.println(flag);
		t1.join();
		t2.join();
		System.out.println("Method checkFieldVisibility is over.");
	}
	
}
