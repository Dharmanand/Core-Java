package com.kd.threads;

/**
 * 
 * @author Kumar
 * 
 *         Two thread print no's alternatively (one after another)
 * 
 *         Example: 
 *         		Thread-0 --> 1 
 *         		Thread-1 --> 2 
 *         		Thread-0 --> 3 
 *         		Thread-1 --> 4
 *         		......so on.
 */
public class ThreadsRunInAlternatively {

//	public static volatile Integer i;
	static Object lock = new Object();

	public static void main(String[] args) throws InterruptedException {

		Runnable task = new Runnable() {

			@Override
			public void run() {
				try {
					execute();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};

		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t2.start();
		t1.start();

	}

	public static void execute() throws InterruptedException {
		synchronized (lock) {
			for (int i = 1; i <= 100; i++) {
				lock.notify();
				if (i % 2 != 0 && Thread.currentThread().getName().equalsIgnoreCase("Thread-0")) {
					System.out.println("Thread Name: " + Thread.currentThread().getName() + "--" + i);
				} else if (i % 2 == 0 && Thread.currentThread().getName().equalsIgnoreCase("Thread-1")) {
					System.out.println("Thread Name: " + Thread.currentThread().getName() + "--" + i);
				}
				lock.wait();
			}
			lock.notify();
		}
	}
}
